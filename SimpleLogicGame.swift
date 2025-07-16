import SwiftUI
struct ImageGame: View {
    @State private var userName: String = ""
    @State private var password: String = ""
    @State private var showErrorName: Bool = false
    @State private var showErrorPassword: Bool = false
    @State private var showGame: Bool = false

    var body: some View {
        ZStack {
            if showGame {
                GameLoginPage(userName: userName) {
                    // Logout callback from game
                    userName = ""
                    password = ""
                    showGame = false
                }
                .transition(.opacity)
                .animation(.easeInOut, value: showGame)
            } else {
                loginView
                    .transition(.opacity)
                    .animation(.easeInOut, value: showGame)
            }
        }
    }

    var loginView: some View {
        ZStack {
            Color.blue.ignoresSafeArea()

            VStack(alignment: .leading, spacing: 20) {
                Text("Login")
                    .font(.system(size: 30, weight: .bold))
                    .foregroundColor(.white)

                Text("User Name").foregroundColor(.white)
                if showErrorName {
                    Text("Please enter your user name")
                        .foregroundColor(.red)
                        .opacity(0.8)
                        .font(.system(size: 15))
                }
                TextField("Enter your name", text: $userName)
                    .textFieldStyle(RoundedBorderTextFieldStyle())

                Text("Password").foregroundColor(.white)
                if showErrorPassword {
                    Text("Please enter your password")
                        .foregroundColor(.red)
                        .opacity(0.8)
                        .font(.system(size: 15))
                }
                SecureField("Enter your password", text: $password)
                    .textFieldStyle(RoundedBorderTextFieldStyle())

                HStack {
                    Spacer()
                    Button(action: {
                        showErrorName = false
                        showErrorPassword = false

                        guard !userName.isEmpty else {
                            showErrorName = true
                            return
                        }
                        guard !password.isEmpty else {
                            showErrorPassword = true
                            return
                        }

                        showGame = true
                    }) {
                        Text("Submit")
                            .foregroundColor(.white)
                            .font(.system(size: 20, weight: .bold))
                    }
                    .frame(width: 120, height: 45)
                    .background(Color.black)
                    .clipShape(RoundedRectangle(cornerRadius: 8))
                    .padding(.trailing)
                }
            }
            .padding(.horizontal)
        }
    }
}

struct GameLoginPage: View {
    var userName: String
    var onLogout: () -> Void

    @State private var images = Array(repeating: "", count: 12)
    @State private var showImages = Array(repeating: false, count: 12)
    @State private var firstTapIndex: Int? = nil
    @State private var secondTapIndex: Int? = nil
    @State private var score = 0
    @State private var wrongTries = 0
    @State private var gameOver = false

    let imageAll: [String] = [
        "AppleImage", "BananaImage", "GrapesImage",
        "MangoImage", "OrangeImage", "Wattermelon"
    ]

    var body: some View {
        ZStack {
            Color.blue.ignoresSafeArea()

            let firstLetter = String(userName.prefix(1)).uppercased()

            VStack(spacing: 20) {
                HStack(spacing: 20) {
                    Button("< Back") {
                        onLogout()
                    }
                    .foregroundColor(.white)
                    .padding(8)
                    .overlay(RoundedRectangle(cornerRadius: 8).stroke(Color.white, lineWidth: 1))

                    Spacer()

                    Text(userName.capitalized)
                        .font(.title)
                        .foregroundColor(.white)

                    Spacer()

                    ZStack {
                        Circle()
                            .fill(Color.white)
                            .frame(width: 50, height: 50)
                        Text(firstLetter)
                            .foregroundColor(.black)
                    }
                }
                .padding(.horizontal)

                Spacer()

                ForEach(0..<4, id: \.self) { row in
                    HStack(spacing: 16) {
                        ForEach(0..<3, id: \.self) { col in
                            let index = row * 3 + col
                            imageView(for: index)
                        }
                    }
                }

                Spacer()

                Text("Score: \(score)")
                    .font(.title2)
                    .foregroundColor(.white)

                Spacer()
            }

            if gameOver {
                GameOveFullScreenView(finalScore: score, onRestart: {
                    resetGame()
                }, onLogout: {
                    onLogout()
                })
            }
        }
        .onAppear {
            setupImages()
        }
    }

    func imageView(for index: Int) -> some View {
        ZStack {
            if showImages[index] {
                Image(images[index])
                    .resizable()
                    .scaledToFit()
                    .frame(width: 70, height: 70)
                    .onTapGesture {
                        handleTap(index: index)
                    }
            } else {
                Rectangle()
                    .fill(Color.gray)
                    .frame(width: 70, height: 70)
                    .onTapGesture {
                        handleTap(index: index)
                    }
            }
        }
        .cornerRadius(10)
        .shadow(radius: 2)
    }

    func setupImages() {
        var temp = imageAll + imageAll
        temp.shuffle()
        images = temp
    }

    func handleTap(index: Int) {
        if showImages[index] || secondTapIndex != nil || gameOver {
            return
        }

        showImages[index] = true

        if firstTapIndex == nil {
            firstTapIndex = index
        } else {
            secondTapIndex = index
            DispatchQueue.main.asyncAfter(deadline: .now() + 0.8) {
                checkMatch()
            }
        }
    }

    func checkMatch() {
        guard let first = firstTapIndex, let second = secondTapIndex else { return }

        if images[first] == images[second] {
            score += 1
        } else {
            showImages[first] = false
            showImages[second] = false
            wrongTries += 1

            if wrongTries >= 3 {
                gameOver = true
            }
        }

        firstTapIndex = nil
        secondTapIndex = nil
    }

    func resetGame() {
        score = 0
        wrongTries = 0
        gameOver = false
        showImages = Array(repeating: false, count: 12)
        firstTapIndex = nil
        secondTapIndex = nil
        setupImages()
    }
}
struct GameOveFullScreenView: View {
    let finalScore: Int
    let onRestart: () -> Void
    let onLogout: () -> Void

    var body: some View {
        ZStack {
            Color.black.opacity(0.8).ignoresSafeArea()

            VStack(spacing: 30) {
                HStack{
                    Spacer()
                    Button("Logout", action: onLogout)
                        .foregroundColor(.white)
                        .padding()
                        .frame(width: 100)
                        .background(Color.red)
                        .cornerRadius(12)
                   
                }
                Spacer()
                Text("Game Over")
                    .foregroundColor(.red)
                    .font(.system(size: 32, weight: .bold))

                Text("Final Score:\n\(finalScore)")
                    .foregroundColor(.white)
                    .font(.system(size: 26))
                    .multilineTextAlignment(.center)

                Button("Restart Game", action: onRestart)
                    .foregroundColor(.white)
                    .padding()
                    .frame(width: 180)
        .background(Color.blue)
                    .cornerRadius(12)
                Spacer()
              
            }
            .padding()
        }
    }
}
#Preview {
    ImageGame()
}

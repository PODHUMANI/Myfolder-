import SwiftUI

struct TimerExampleView: View {
    @State private var count = 0
    let timer = Timer.publish(every: 1, on: .main, in: .common).autoconnect()

    var body: some View {
        VStack(spacing: 20) {
            Text("Count: \(count)")
                .font(.largeTitle)
                .bold()

            Button("Reset") {
                count = 0
            }
        }
        .onReceive(timer) { _ in
            count += 1
        }
    }
}

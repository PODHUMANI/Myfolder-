import AVFoundation

class AudioManager {
    var player: AVPlayer?
    var playlist = [
        URL(string: "https://example.com/song1.mp3")!,
        URL(string: "https://example.com/song2.mp3")!
    ]
    var currentIndex = 0

    func playCurrentTrack() {
        let url = playlist[currentIndex]
        player = AVPlayer(url: url)
        player?.play()
    }

    func nextTrack() {
        currentIndex = (currentIndex + 1) % playlist.count
        playCurrentTrack()
    }

    func previousTrack() {
        currentIndex = (currentIndex - 1 + playlist.count) % playlist.count
        playCurrentTrack()
    }
}

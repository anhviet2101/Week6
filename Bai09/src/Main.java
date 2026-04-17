public class Main {
    public static void main(String[] args) {
        AudioPlayable audioPlayer = new AudioPlayer();
        VideoPlayable videoPlayer = new VideoPlayer();

        MediaPlayer mediaPlayer = new MediaPlayer(audioPlayer, videoPlayer);

        mediaPlayer.playVideo("HarryPotter.mp4");
        mediaPlayer.playAudio("Song.mp3");

    }
}

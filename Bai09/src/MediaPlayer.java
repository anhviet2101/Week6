public class MediaPlayer {
    private AudioPlayable audio;
    private VideoPlayable video;
    public MediaPlayer (AudioPlayable audioPlayer, VideoPlayable videoPlayer){
        audio = audioPlayer;
        video = videoPlayer;
    }
    public void playAudio(String file){
        this.audio.playAudio(file);
    }
    public void playVideo(String file){
        this.video.playVideo(file);
    }
}

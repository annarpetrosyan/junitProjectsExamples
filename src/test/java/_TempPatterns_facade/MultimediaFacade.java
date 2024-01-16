package _TempPatterns_facade;

public class MultimediaFacade {
    private AudioPlayer audioPlayer;
    private VideoPlayer videoPlayer;

    public MultimediaFacade() {
        this.audioPlayer = new AudioPlayer();
        this.videoPlayer = new VideoPlayer();
    }

    public void play() {
        audioPlayer.playAudio();
        videoPlayer.playVideo();
    }
}

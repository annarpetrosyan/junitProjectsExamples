package _TempPatterns_facade;

public class Client {
    public static void play1() {
        AudioPlayer audioPlayer = new AudioPlayer() ;
        VideoPlayer videoPlayer = new VideoPlayer() ;
        audioPlayer.playAudio();
        videoPlayer.playVideo();
    }


    public static void main(String[] args) {
        MultimediaFacade multimediaFacade = new MultimediaFacade();
        multimediaFacade.play();

        play1();
    }

}

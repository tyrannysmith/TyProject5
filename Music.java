public class Music extends ServiceCommunicator{
    private String music;

    public Music(String music){
        super("https://itunes.apple.com/search?term=SEARCH&limit=1" + music);
        this.music = music;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public static void main(String[] args) {
        Music m = new Music ("Brandy");
        m.connect();
        String response = m.get();
        System.out.println("MUSIC RESULTS:  ");
        System.out.println(response);
    }
}

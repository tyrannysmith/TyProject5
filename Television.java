public class Television extends ServiceCommunicator{
    private String television;

    public Television(String television) {
        super("http://api.tvmaze.com/singlesearch/shows?q=SEARCH" + television);
        this.television = television;
    }

    public String getTelevision() {
        return television;
    }

    public void setTelevision(String television) {
        this.television = television;
    }

    public static void main(String[] args) {
        Television t = new Television("");
        t.connect();
        String response = t.get();
        System.out.println("TELEVISION RESULTS: ");
        System.out.println(response);
    }
}

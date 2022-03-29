public class Zipcode extends ServiceCommunicator{
    private String zipcode;

    public Zipcode(String zipcode) {
        super("http://api.zippopotam.us/us/" + zipcode);
        this.zipcode = zipcode;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public static void main(String[] args) {
        Zipcode z = new Zipcode("60461");
        z.connect();
        String response = z.get();
        System.out.println("ZIP RESULTS: ");
        System.out.println(response);
    }
}
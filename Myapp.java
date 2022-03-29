import java.util.Scanner;

class MyApp {
    public static void main(String[] args) {
        Scanner userinput;

        while (true) {

            System.out.print("Select one of these options:\n" +
                    "A. Search a zipcode \n" +
                    "B. Search TV show name or Episode\n" +
                    "C. Search song title or artist name\n" +
                    "Enter quit to stop\n");
            userinput = new Scanner(System.in);
            String cmd = userinput.next();


            if (cmd.equalsIgnoreCase("a")) {

                System.out.printf("Enter zipcode:");
                String zpcmd = userinput.next();
                Zipcode zp = new Zipcode(zpcmd);
                zp.setURL("http://api.zippopotam.us/us/" + zpcmd);
                zp.connect();
                String mystring = zp.get();
                System.out.println(mystring);
                System.out.println("\n");

            } else if (cmd.equalsIgnoreCase("b")) {

                System.out.println("Enter TV show or Episode name");
                String tvcmd = userinput.next();
                Television tv = new Television(tvcmd);
                tv.setURL("http://api.tvmaze.com/singlesearch/shows?q=" + tvcmd);
                tv.connect();
                String mystring = tv.get();
                System.out.println(mystring);
                System.out.println("\n");

            } else if (cmd.equalsIgnoreCase("c")) {

                System.out.println("Enter song title or artist name");
                String mscmd = userinput.next();
                Music ms = new Music(mscmd);
                ms.setURL("https://itunes.apple.com/search?term=" + mscmd + "&limit=1");
                ms.connect();
                String mystring = ms.get();
                System.out.println(mystring);
                System.out.println("\n");

            } else if (cmd.equalsIgnoreCase("quit")) {

                break;

            }
        }
    }
}
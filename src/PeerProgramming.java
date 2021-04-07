import java.util.Locale;

public class PeerProgramming {
    public static void main(String[] args) {
        String x = "Hello World";

        for( int i = 0; i<x.length(); i++){
            // length = 11
            // i in the 10 place is d

            System.out.print(x.toUpperCase().charAt(i)+"   ");
        }
    }
}

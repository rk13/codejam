import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    static List<Slide> photos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = Integer.valueOf(in.nextLine());
        for (int i = 1; i <= t; i++) {
            String[] s = in.nextLine().split(" ");



            BigInteger x = new BigInteger(s[0]);
            BigInteger y = new BigInteger(s[1]);
            String r = process(x, y);
            System.out.println("Case #" + i + ": " + r);
        }
    }

    public static String process(BigInteger x, BigInteger y) {
        return process(x.intValue(), y.intValue());
    }

    public static String process(int x, int y) {
        return x + " " + y;
    }


    4
    H 3 cat beach sun
    V 2 selfie smile
    V 2 garden selfie
    H 2 garden cat
}
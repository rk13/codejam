import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class App {

    static String[][] input;

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = Integer.valueOf(in.nextLine());

        input = new String[t][];
        for (int i = 1; i <= t; i++) {
            input[i-1] = in.nextLine().split(" ");
        }
    }

    public static String process(BigInteger x, BigInteger y) {
        return process(x.intValue(), y.intValue());
    }

    public static String process(int x, int y) {
        return x + " " + y;
    }
}
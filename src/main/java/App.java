import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class App {

    static String[][] input;
    static int[][] adj;


    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/tmp/input.txt");
        Scanner in = new Scanner(new BufferedReader(new FileReader(file)));
        int t = Integer.valueOf(in.nextLine());

        input = new String[t][];
        for (int i = 1; i <= t; i++) {
            input[i - 1] = in.nextLine().split(" ");
        }

        

        SubmissionWriter.CreateSubmission(result, "/tmp/result.txt");
    }

    public static String process(BigInteger x, BigInteger y) {
        return process(x.intValue(), y.intValue());
    }

    public static String process(int x, int y) {
        return x + " " + y;
    }
}
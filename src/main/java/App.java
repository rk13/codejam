import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class App {

    static String[][] input;
    static int[][] adj;


    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = Integer.valueOf(in.nextLine());

        input = new String[t][];
        for (int i = 1; i <= t; i++) {
            input[i - 1] = in.nextLine().split(" ");
        }

        adj = new int[t][t];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (i == j) {
                    adj[i][j] = 0;
                } else {
                    adj[i][j] = Scoring.score(input[i], input[j]);
                }
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }

        List<Integer> visitedList = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();

        int current = 0;
        int maxPos;

        do {
            maxPos = 0;
            visitedList.add(current);
            visited.add(current);

            int max = 0;
            for (int i = 0; i < t; i++) {
                if (!visited.contains(i) && adj[current][i] > max) {
                    maxPos = i;
                    max = adj[current][i];
                }
            }
            current = maxPos;
        } while (maxPos > 0);
        
    }

    public static String process(BigInteger x, BigInteger y) {
        return process(x.intValue(), y.intValue());
    }

    public static String process(int x, int y) {
        return x + " " + y;
    }
}
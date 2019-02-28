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

        //adj = new int[t][t];
        Map<String, Integer> adj = new HashMap<>();

//        t = 10000;

        for (int i = 0; i < t; i++) {
            for (int j = i; j < t; j++) {
                if (i == j) {
                    //adj[i][j] = 0;
                } else {
                    //adj[i][j] = Scoring.score(input[i], input[j]);
                    int score = Scoring.score(input[i], input[j]);
                    if (score > 0) {
                        adj.put(i + "," + j, score);
                    }
                }
//                System.out.print(adj[i][j] + " ");
            }
            System.out.println(i);
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
                if (!visited.contains(i) && adj.getOrDefault(current + "," + i, 0) > max) {
                    maxPos = i;
                    max = adj.get(current + "," + i);
                }
            }
            current = maxPos;
        } while (maxPos > 0);

        int[][] result = new int[visitedList.size()][1];
        for(int i=0; i<visitedList.size(); i++) {
            result[i][0] = visitedList.get(i);
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
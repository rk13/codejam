import java.io.PrintWriter;
import java.io.*;

public class SubmissionWriter {

    static public  void CreateSubmission(int[][] inputSlideShow, String fileName)
    {
        File file = new File(fileName);
        file.getParentFile();
        try {
            PrintWriter writer = new PrintWriter(fileName);
            writer.println(inputSlideShow.length);
            for (int i = 0; i < inputSlideShow.length; i++) {
                String line = "";
                for (int n = 0; n < inputSlideShow[i].length; n++)
                {
                    line = line + inputSlideShow[i][n];
                    if (n != inputSlideShow[i].length - 1)
                    {
                        line += " ";
                    }
                }
                writer.println(line);
            }
            writer.close();
        }
        catch (FileNotFoundException exc)
        {
            // please no :)
        }
    }

}

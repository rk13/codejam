/**
 * @author Vladimir Kotov
 */

public class Scoring {
    static int score(Slide s1, Slide s2) {
        int result = 0;

        int common = 0, unique1 = 0, unique2 = 0;

        for (int i1 = 0; i1 < s1.tags.length; i1++)
        {
            for (int i2 = 0; i2 < s2.tags.length; i2++)
            {
                if (s1.tags[i1] == s2.tags[i2]) {
                    common++;
                    break;
                }
            }
        }

        unique1 = s1.tags.length - common;
        unique2 = s2.tags.length - common;

        result = Math.min(common, unique1);
        result = Math.min(result, unique2);

        return result;
    }
}

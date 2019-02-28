/**
 * @author Vladimir Kotov
 */

public class Scoring {

    static int score(String[] s1tags, String[] s2tags) {
        int result = 0;

        int common = 0, unique1 = 0, unique2 = 0;

        for (int i1 = 2; i1 < s1tags.length; i1++) {
            for (int i2 = 2; i2 < s2tags.length; i2++) {
                if (s1tags[i1].equals(s2tags[i2])) {
                    common++;
                    break;
                }
            }
        }

        unique1 = s1tags.length - common;
        unique2 = s2tags.length - common;

        result = Math.min(common, unique1);
        result = Math.min(result, unique2);

        return result;
    }
}

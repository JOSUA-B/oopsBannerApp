/**
 * OOPS Banner Application
 * UC8 - Map for Character Patterns
 *
 * @author Josua
 * @version 1.7
 */

import java.util.HashMap;
import java.util.Map;

public class oopsBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        renderBanner("OOPS", patternMap);
    }

    // Build map of character patterns
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        map.put('P', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*",
                "*",
                "*"
        });

        map.put('S', new String[]{
                "*****",
                "*",
                "*",
                "*****",
                "    *",
                "    *",
                "*****"
        });

        return map;
    }

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> map) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                String[] pattern = map.get(c);

                line.append(pattern[row]).append(" ");
            }

            System.out.println(line);
        }
    }
}

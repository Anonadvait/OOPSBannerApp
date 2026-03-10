/**
 * OOPSBannerApp
 *
 * This application prints the word "OOPS" in banner format
 * using a HashMap to store character patterns.
 *
 * @author Erza
 * @version 8.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        String word = "OOPS";

        Map<Character, String[]> patternMap = buildPatternMap();

        renderBanner(word, patternMap);
    }

    // Build the pattern map
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ******** ",
                "*        *",
                "*        *",
                "*        *",
                "*        *",
                "*        *",
                " ******** "
        });

        map.put('P', new String[]{
                " ******** ",
                "*        *",
                "*        *",
                " ******** ",
                "*         ",
                "*         ",
                "*         "
        });

        map.put('S', new String[]{
                " ******** ",
                "*         ",
                "*         ",
                " ******** ",
                "         *",
                "         *",
                " ******** "
        });

        return map;
    }

    // Render the banner
    public static void renderBanner(String word, Map<Character, String[]> map) {

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                String[] pattern = map.get(c);

                line.append(pattern[i]).append("   ");
            }

            System.out.println(line);
        }
    }
}
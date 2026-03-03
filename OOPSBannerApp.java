public class OOPSBannerApp {

    public static void main(String[] args) {

        String word = "OOPS";

        CharacterPattern O = new CharacterPattern('O', new String[] {
                " ******** ",
                "*        *",
                "*        *",
                "*        *",
                "*        *",
                "*        *",
                " ******** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[] {
                " ******** ",
                "*        *",
                "*        *",
                " ******** ",
                "*         ",
                "*         ",
                "*         "
        });

        CharacterPattern S = new CharacterPattern('S', new String[] {
                " ******** ",
                "*         ",
                "*         ",
                " ******** ",
                "         *",
                "         *",
                " ******** "
        });

        CharacterPattern[] patterns = { O, O, P, S };

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : patterns) {
                line.append(cp.getPattern()[i]).append("   ");
            }

            System.out.println(line);
        }
    }

    // Static Inner Class
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
}
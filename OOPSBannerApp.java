public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "   " + O[i] + "   " + P[i] + "   " + S[i]);
        }
    }

    public static String[] getO() {
        return new String[] {
                " ******** ",
                "*        *",
                "*        *",
                "*        *",
                "*        *",
                "*        *",
                " ******** "
        };
    }

    public static String[] getP() {
        return new String[] {
                " ******** ",
                "*        *",
                "*        *",
                " ******** ",
                "*         ",
                "*         ",
                "*         "
        };
    }

    public static String[] getS() {
        return new String[] {
                " ******** ",
                "*         ",
                "*         ",
                " ******** ",
                "         *",
                "         *",
                " ******** "
        };
    }
}
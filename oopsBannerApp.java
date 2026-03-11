/**
 * OOPS Banner Application
 * UC6 - Static Functions
 *
 * @author Josua
 * @version 1.5
 */

public class oopsBannerApp {

    public static void main(String[] args) {

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ",
                    getO()[i],
                    getO()[i],
                    getP()[i],
                    getS()[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Pattern for letter O
    public static String[] getO() {
        return new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        };
    }

    // Pattern for letter P
    public static String[] getP() {
        return new String[]{
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*",
                "*",
                "*"
        };
    }

    // Pattern for letter S
    public static String[] getS() {
        return new String[]{
                "*****",
                "*",
                "*",
                "*****",
                "    *",
                "    *",
                "*****"
        };
    }
}
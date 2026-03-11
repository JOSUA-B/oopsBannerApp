/**
 * OOPS Banner Application
 * UC5 - Array Initialization
 *
 * @author Josua
 * @version 1.4
 */

public class oopsBannerApp {

    public static void main(String[] args) {

        String[] banner = {
            String.join(" ", "*****", "*****", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*   *", "*   *"),
            String.join(" ", "*   *", "*   *", "*   *", "*   *"),
            String.join(" ", "*   *", "*****", "*****", "*****"),
            String.join(" ", "*   *", "*", "*", "*"),
            String.join(" ", "*   *", "*", "*", "*"),
            String.join(" ", "*****", "*", "*", "*")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
} 
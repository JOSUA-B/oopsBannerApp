/**
 * OOPS Banner Application
 * UC4 - Array and Loop Implementation
 * 
 * @author Josua
 * @version 1.3
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
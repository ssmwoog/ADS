import java.util.Scanner;

public class DigitChecker {
    public static boolean checkDigits(String str) {
        if (str.isEmpty()) {
            return true;
        }

        if (!Character.isDigit(str.charAt(0))) {
            return false;
        }

        return checkDigits(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        if (checkDigits(inp)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
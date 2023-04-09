import java.util.Scanner;

public class PowerMachine {
    public static int power(int a, int n) {
        if (n != 0) {
            return (a * power(a, n - 1));
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(power(a, n));
    }
}
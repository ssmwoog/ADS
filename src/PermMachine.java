import java.util.Scanner;

public class PermMachine {
    public static void sw(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void permut(char[] chars, int index) {
        if (index == chars.length - 1) {
            System.out.println(String.valueOf(chars));
        }

        for (int i = index; i < chars.length; i++)
        {
            sw(chars, index, i);
            permut(chars, index + 1);
            sw(chars, index, i);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        permut(word.toCharArray(), 0);
    }
}

import java.util.Scanner;

public class Finder {
    public static int findMin(int arr[], int n) {
        if(n == 1) {
            return arr[0];
        }

        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        int v = findMin(arr, n);
        System.out.println(v);
    }
}
import java.util.Scanner;

public class AverageFinder {
    static double findAverage(int a[], int i, int n) {
        if (i == n - 1) {
            return a[i];
        }

        if (i == 0) {
            return ((a[i] + findAverage(a, i + 1, n)) / n);
        }

        return (a[i] + findAverage(a, i+1, n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double v = findAverage(arr, 0, n);
        System.out.println(v);
    }
}

import java.util.Scanner;

public class Q6_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long c = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (i > 0 && a[i] < a[i - 1]) {
                c += a[i - 1] - a[i];
                a[i] = a[i - 1];
            }
        }

        System.out.println(c);
    }
}

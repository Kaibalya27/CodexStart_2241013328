/*
 * Name: Kaibalya Mohapatra
 * Reg No: 2241013328
 * PS LINK: https://cses.fi/problemset/task/1617
 */

import java.util.Scanner;

public class Q5_1617 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long result=1;
        for (int i = 0; i < n; i++) {
            result = (result * 2) % 1000000007;
        }

        System.out.println(result);
    }
}

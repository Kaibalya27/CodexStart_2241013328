/*
 * Name: Kaibalya Mohapatra
 * Reg No: 2241013328
 * PS LINK: https://cses.fi/problemset/task/1069
 */

import java.util.Scanner;

public class Q4_1069 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char[]b=a.toCharArray();
        long c=1,max=1;
        for (int i = 1; i <b.length; i++) {
            if(b[i]==b[i-1]) {
                c++;
            }
            else
                c=1;
            max=Math.max(max,c);
        }

        System.out.println(max);    }
}

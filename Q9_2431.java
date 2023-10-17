/*
 * Name: Kaibalya Mohapatra
 * Reg No: 2241013328
 * PS LINK: https://cses.fi/problemset/task/2431
 */

import java.io.*;

public class Q9_2431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(br.readLine());
        for (int i = 0; i < q; i++) {
            long k = Long.parseLong(br.readLine().trim());
            long start = 1, len = 1, curr = 9;

            while (k > len * curr) {
                k -= len * curr;
                start *= 10;
                len++;
                curr *= 10;
            }

            long number = start + (k - 1) / len;
            int digit = Long.toString(number).charAt((int) ((k - 1) % len)) - '0';
            out.println(digit);
        }

        out.flush();
    }
}

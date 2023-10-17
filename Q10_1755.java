import java.io.*;


public class Q10_1755 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        char[] s = br.readLine().toCharArray();
        int[] freq = new int[26];
        StringBuilder p = new StringBuilder();
        int oddCount = 0;
        char oddChar = 0;

        for (char c : s) freq[c - 'A']++;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                oddCount++;
                oddChar = (char) (i + 'A');
            }
            p.append(String.valueOf((char) (i + 'A')).repeat(freq[i] / 2));
        }

        out.println(oddCount > 1 ? "NO SOLUTION" : p.toString() + (oddCount == 1 ? oddChar : "") + p.reverse());

        out.flush();
    }
}

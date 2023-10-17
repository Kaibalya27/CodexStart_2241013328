import java.io.*;

public class Q8_1618 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }

        out.println(count);
        out.flush();
    }
}

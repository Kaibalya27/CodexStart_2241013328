import java.io.*;

public class Q7_1070 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        if (n==1){
            out.print(1);
        }
        if (n < 4 && n!=1) {
            out.println("NO SOLUTION");
        } else {
            for (int i = 2; i <= n; i += 2) {
                out.print(i + " ");
            }
            for (int i = 1; i <= n; i += 2) {
                out.print(i + " ");
            }
        }

        out.flush();
    }
}

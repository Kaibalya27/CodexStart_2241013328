import java.util.Scanner;

public class rep {
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

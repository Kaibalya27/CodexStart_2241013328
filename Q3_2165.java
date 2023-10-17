import java.util.Scanner;

public class Q3_2165 {
    static void TOH(long a,String A,String B,String C){
        if (a==1) {
            System.out.println( A + " " + C);
            return;
        }
        TOH(a-1,A,C,B);
        System.out.println(A+" "+C);
        TOH(a-1,B,A,C);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println((long) Math.pow(2,n)-1);
        TOH(n,"1","2","3");

    }


}

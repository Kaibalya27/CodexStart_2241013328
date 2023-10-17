import java.util.Scanner;

public class Q2_1068 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.printf("%d ",n);
        while(n!=1){
            if (n%2==0)
                n=(long) n/2;
            else
                n=(long) n*3+1;
            System.out.printf("%d ",n);
        }
    }
}

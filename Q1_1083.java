import java.util.*;
public class Q1_1083 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n-1];
        long sum=0;
        for (int i = 0; i < n-1; i++) {
            array[i]=sc.nextInt();
            sum+=array[i];
        }
        long sum1=(long)n*(n+1)/2;
        System.out.println(sum1-sum);


    }
}


package variables;

import java.sql.SQLOutput;
import java.util.Scanner;
// Need improvement
public class natutal_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int l=sc.nextInt();
        int sum=0;
        int result;
        for(int s=1;s<=l;s++) {
            if (s % 2 == 0)
            {
                System.out.print(s +" ");
                sum=sum+s;


            }
        }
                //System.out.println();
                System.out.println("\nsum is " + sum);


    }
}

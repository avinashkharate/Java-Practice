package methods;
import java.util.Scanner;
public class Smallest_num {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number:");
        int a=sc.nextInt();
        System.out.print("enter second number:");
        int b=sc.nextInt();
        System.out.print("enter third number");
        int c=sc.nextInt();
        System.out.print("the smallest value is:"+smallest(a,b,c));

    }
    public static int smallest(int a,int b,int c){return Math.min(Math.min(a,b),c);
}
}



package methods;
import java.util.Scanner;

public class Calculator {
    public static int sum(int a,int b){
        int c=a+b;
        return c;

    }
    public static int sub(int a,int b){
        int c=a-b;
        return c;
    }
    public static int div(int a,int b){
        int c=a/b;
        return c;
    }
    public static int mul(int a,int b){
        int c=a*b;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st  number:");
        int num1=sc.nextInt();

        System.out.print("enter 2nd number:");
        int num2=sc.nextInt();

        //System.out.println("sum is "+ sum(num1,num2));
        System.out.print("enter operation number:");
        int num=sc.nextInt();
       // System.out.println("opeartion :"+num);

    if(num==1)
        System.out.println(" sum" +sum(num1,num2));

    else if(num==2)
        System.out.println("sub" +sub(num1,num2));
    else if(num==3)
        System.out.println("div" +div(num1,num2));
    else if(num==4)
        System.out.println("mul" +mul(num1,num2));









    }

}

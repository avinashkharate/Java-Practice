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
        System.out.println("1 <sum");
        System.out.println("2 <sub");
        System.out.println("3 <div");
        System.out.println("4 <mul");

        System.out.print("enter 1st  number:");
        int num1=sc.nextInt();

        System.out.print("enter 2nd number:");
        int num2=sc.nextInt();

        //System.out.println("sum is "+ sum(num1,num2));
        System.out.print("enter operation number:");
        int choice=sc.nextInt();
       // System.out.println("opeartion :"+num);


//    if(choice==1)
//        System.out.println(" sum" +sum(num1,num2));
//
//
//    else if(choice==2)
//        System.out.println("sub" +sub(num1,num2));
//    else if(choice==3)
//        System.out.println("div" +div(num1,num2));
//    else if(choice==4)
//        System.out.println("mul" +mul(num1,num2));
//    else
//        System.out.println("invalid choice");

    switch(choice){
        case 1->System.out.println(" sum" +sum(num1,num2));
        case 2->System.out.println("sub" +sub(num1,num2));
        case 3->System.out.println("div" +div(num1,num2));
        case 4->System.out.println("mul" +mul(num1,num2));
        default->System.out.println("invalid operation" +choice);

    }









    }

}

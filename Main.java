import java.util.Scanner;

public class Main {
    public static int sum(int a, int b){
        return a+b;
    }public static int sub(int a, int b){
        return a-b;
    }public static int divide(int a, int b){
        return a/b;
    }public static int mul(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean run =true;
        while(true) {
            System.out.println("1 > Addition");
            System.out.println("2 > Subtraction");
            System.out.println("3 > Division");
            System.out.println("4 > Multiplication");
            System.out.println("5 > Exit");


            System.out.print("Enter The Operation You Want : ");
            int choice = sc.nextInt();

            int num1;
            int num2;
            if(choice==5){
                break;
            }
            if (choice <= 5) {
                System.out.print("Enter The 1st Number : ");
                num1 = sc.nextInt();

                System.out.print("Enter The 2nd Number : ");
                num2 = sc.nextInt();

                switch (choice) {
                    case 1 -> System.out.printf("Sum of number %d and %d : %d%n", num1, num2, sum(num1, num2));
                    case 2 -> System.out.printf("Subtraction of number %d from %d : %d%n", num2, num1, sub(num1, num2));
                    case 3 -> System.out.printf("Division %d by %d : %d%n", num1, num2, divide(num1, num2));
                    case 4 -> System.out.printf("Multiplication of number %d and %d : %d%n", num1, num2, mul(num1, num2));

                }
            } else System.out.println("Invalid choice, Please Enter a Valid operation number");
        }
    }
}

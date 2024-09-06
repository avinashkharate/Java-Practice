
import java.util.Scanner;
public class harry3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter final velocity");
        double v=sc.nextDouble();
        System.out.print("enter initial velocity");
        double u=sc.nextDouble();
        System.out.print("enter accelertion");
        double a=sc.nextDouble();
        System.out.print("enter displacement");
        double s=sc.nextDouble();

         double result=(v*v-u*u )/(2*a*s);
         System.out.println("result" +result);

    }
}

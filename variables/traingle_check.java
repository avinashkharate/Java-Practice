package variables;
import java.util.Scanner;
public class traingle_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the sides");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
    if(a==b && b==c)
    {
     System.out.println("EQUILATERAL TRIANGLE");
    }
    else if(a==b || b==c|| a==c)
    {
        System.out.println("ISOSCELS TRAINGLE");
    }
    else{
        System.out.println("SCALENE TRIANGLE");
    }
    }

}

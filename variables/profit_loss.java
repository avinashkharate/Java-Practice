package variables;
import java.util.Scanner;
public class profit_loss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the selling price");
        int sp=sc.nextInt();
        System.out.print("enter the cost price");
        int cp=sc.nextInt();
    if(sp>cp)
    {
        System.out.println("profit");
    }
    else{
        System.out.println("loss");
    }
    }
}

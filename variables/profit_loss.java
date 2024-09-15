package variables;
import java.util.Scanner;
// Need Improvement
public class profit_loss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the selling price:");
        final int sp=sc.nextInt();
        System.out.print("enter the cost price:");
        final int cp=sc.nextInt();
    if(sp>cp)
    {
        int profit=sp-cp;
        System.out.println("profit:" +profit);

    }
    else{
        int loss=cp-sp;
        System.out.println("loss:" +loss);
    }

    }
}

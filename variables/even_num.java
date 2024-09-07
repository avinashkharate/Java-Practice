package variables;
import java.util.Scanner;
public class even_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int l=sc.nextInt();
        for(int s=1;s<=l;s++){
            if(s%2==0)
                 System.out.println(s);
        }
    }
}

package variables;
import java.util.Scanner;
public class loop_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        int num=sc.nextInt();
        System.out.println("multiplication table" +num);

    for(int i=1;i<=10;i++){
        System.out.println("result is "  +(num * i));

    }
    }
}

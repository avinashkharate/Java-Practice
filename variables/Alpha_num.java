package variables;
import java.util.Scanner;
public class Alpha_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the values");
        char ch=sc.next().charAt(0);

        if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
            System.out.println("aplhabet");
        }

        if (ch>='0'&& ch<='9') {
            System.out.println("number");
        }
        else{
            System.out.println("special character");
            }
        }

    }


package variables;

import java.util.Scanner;

public class loop_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the starting number");
        int s = sc.nextInt();
        System.out.print("enter the ending number");
        int e = sc.nextInt();
        while (s >= e) {
            System.out.println(s);
            s--;
        }
    }
}

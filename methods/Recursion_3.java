package methods;

public class Recursion_3 {
    public static int fibonacii(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fibonacii(n-1)+fibonacii(n-2);
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println("the result is "+ fibonacii(n-1)+fibonacii(n-2));

    }
}

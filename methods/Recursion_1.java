package methods;

public class Recursion_1 {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }

    }
    public static void main(String[] args) {
        int n=6;
        System.out.println("the value of factorial n is:" +factorial(n));

    }
}

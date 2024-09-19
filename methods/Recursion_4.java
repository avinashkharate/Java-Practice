package methods;

public class Recursion_4 {
    public static int exponent(int base,int exponent){
        if (exponent==0){
            return 1;
        }
        return base* exponent(base,exponent-1);
    }
    public static void main(String[] args) {
        int base=4;
        int exponent=3;
        int result=exponent(base,exponent);
        System.out.println("result is" +result);

    }
}

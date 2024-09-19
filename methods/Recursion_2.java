package methods;

public class Recursion_2 {
     public static int calculateSum(int n){
         if(n==0){
             return 0;
         }
         else{
             return n+ calculateSum(n-1);
         }
     }
    public static void main(String[] args) {
         int n=7;
         int sum=calculateSum(n);
         System.out.println("sum of numbers is" +n +"is:"+sum);

    }

}

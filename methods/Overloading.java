package methods;


public class Overloading {
     void print (int num){
        System.out.println("int: " +num);
    }
      void print(double num){
         System.out.println("double: " +num);
      }
    public static void main(String[] args) {
        Overloading obj=new Overloading();
        obj.print(18);
        obj.print(18.44);
    }

}

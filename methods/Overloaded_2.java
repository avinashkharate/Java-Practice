package methods;

public class Overloaded_2 {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Overloaded_2 obj=new Overloaded_2();
        System.out.println("sum of two num: " +obj.add(4,6));
        System.out.println("sum of three num: " +obj.add(4,5,6));


    }
}

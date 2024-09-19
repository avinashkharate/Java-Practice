package methods;

public class Overloaded_3 {
    void print(String text){
        System.out.println("String:" +text);

    }
    void print(int num){
        System.out.println("Integer:" +num);
    }

    public static void main(String[] args) {
        Overloaded_3 obj=new Overloaded_3();
        obj.print("hello world");
        obj.print(15);

    }
}

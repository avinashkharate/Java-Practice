package Oops;
class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length *breadth;
    }
    public int perimeter(){
        return 2*length*breadth;
    }

}

public class Oops_4 {
    public static void main(String[] args) {
        Rectangle rect=new Rectangle();
        rect .length=4;
        rect. breadth=5;
        System.out.println(rect .area());
        System.out.println(rect.perimeter());


    }
}

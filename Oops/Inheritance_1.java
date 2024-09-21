package Oops;
class Circle1{
    public int radius;
    Circle1(){
        System.out.println("i am non param of circle");
    }
    Circle1(int r){
        System.out.println("i am a circle parameterized constructor");
        this.radius=r;
    }
    public double area(){
        return 3.14*radius*radius;
    }
}
class Cylinder extends Circle1{
    public int height;
    Cylinder(int r,int h){
        super(r);
        System.out.println("i am a cylinder parameterized constructor");
        this.height=h;

    }
    public double volume(){
        return 3.14*radius*radius*height;
    }

}

public class Inheritance_1 {
    public static void main(String[] args) {
        Cylinder obj=new Cylinder(12,4);

    }


}

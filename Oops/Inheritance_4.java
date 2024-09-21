package Oops;
class Shape{
    public double getPerimeter(){
        return 0.0;
    }
    public double getArea(){
        return 0.0;
    }
}
class Circle2 extends Shape{
    private double radius;
    public Circle2(double radius){
        this.radius=radius;
    }
    public double getPerimeter(){
        return 2*3.14*radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}


public class Inheritance_4 {
    public static void main(String[] args) {
        double r=5.0;
        Circle2 c1=new Circle2(r);
        System.out.println("radius of circle:" +r);
        System.out.println("perimeter of circle:" +c1.getPerimeter());
        System.out.println("area of circle is :" +c1.getArea());


    }
}

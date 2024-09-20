package Oops;
class Circle{
    private double radius;

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return radius*radius;
    }
    public double calculatePerimeter(){
        return 2*3.14*radius;
    }
}

public class Getters_2 {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.setRadius(4.0);
        double radius=circle.getRadius();
        double area=circle.calculateArea();
        double perimeter=circle.calculatePerimeter();

        System.out.println("radius is:" +radius);
        System.out.println("area is:" +area);
        System.out.println("perimeter is:" +perimeter);

    }
}

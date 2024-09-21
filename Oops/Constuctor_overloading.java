package Oops;
class Box
{
    double width,height,depth;
    Box()
    {
        width=1;
        height=1;
        depth=1;
    }
    Box(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    void MyMethod()
    {
        System.out.println("width:" +width);
        System.out.println("height:" +height);
        System.out.println("depth:" +depth);
    }
}
public class Constuctor_overloading {
    public static void main(String[] args) {
        Box box1=new Box();
        Box box2=new Box(4,5,6);
        box2.MyMethod();

    }
}

package Oops;
class Parent {
    Parent() {
        System.out.println("parent constructor");
    }
}
class Child extends Parent
 {

       Child()
       {
           System.out.println("Child constructor");
       }
    }


public class Constructor_chaining{
    public static void main(String[] args) {
        Child child=new Child();
    }
}

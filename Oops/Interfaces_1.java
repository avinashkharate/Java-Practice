package Oops;
class Monkey{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("hello sir");
    }
    @Override
    public void eat(){
        System.out.println("eating");
    }
    @Override
    public void sleep(){
        System.out.println("sleeping");
    }

        }



public class Interfaces_1 {
    public static void main(String[] args) {
        Human h1=new Human();
        h1.sleep();
    }
}

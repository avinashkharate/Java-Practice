package Oops;
class Animal {
    public void makeSound() {
        System.out.println("the animal makes a sound");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("the cat quarrels");
    }
}

public class Inheritance_2 {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Cat cat=new Cat();
        animal.makeSound();
        cat.makeSound();

    }
}

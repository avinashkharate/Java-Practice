package Oops;
class Superclass{
    public int getNumber(){
        return 10;
    }
}
class Subclass extends Superclass{
    @Override
    public int getNumber(){
        return 24;
    }
}

public class Overriding_2 {
    public static void main(String[] args) {
        Superclass superObj=new Superclass();
        Subclass subObj=new Subclass();
        System.out.println("Superclass number:" +superObj.getNumber());
        System.out.println("Subclass number:" +subObj.getNumber());

    }
}

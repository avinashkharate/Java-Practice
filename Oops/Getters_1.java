package Oops;
class Rectangle1{
    private int length;
    private int breadth;

    public int getLength(){
        return length;

    }
    public void setLength(int length){
        this.length=length;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setBreadth(int breadth){
        this.breadth=breadth;
    }


}

public class Getters_1 {
    public static void main(String[] args) {
        Rectangle1 rectangle=new Rectangle1();
        rectangle.setLength(10);
        rectangle.setBreadth(5);

        int length=rectangle.getLength();
        int breadth=rectangle.getBreadth();

        System.out.println("length:" +length);
        System.out. println("breadth:" +breadth);

    }
}

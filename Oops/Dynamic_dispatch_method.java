package Oops;
class Phone{
    public void showTime(){
        System.out.println("it is 4 am");
    }
    public void on(){
        System.out.println("turning on phone");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("playing music");
    }
    public void on(){
        System.out.println("turning on smartphone");
    }
}

public class Dynamic_dispatch_method {
    public static void main(String[] args) {
        Phone obj=new SmartPhone();
        obj.showTime();
        obj.on();

    }
}

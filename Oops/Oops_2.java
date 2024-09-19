package Oops;
class Cellphone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating");
    }
}

public class Oops_2 {
    public static void main(String[] args) {
        Cellphone vivo=new Cellphone();
        vivo.vibrate();
        vivo.ring();

    }
}

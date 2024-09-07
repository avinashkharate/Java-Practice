package ArraysInJava;

public class practice_set {
    public static void main(String[] args) {
        float[]marks={45.7f,67.8f,45.9f,65.6f,98.9f};
        float sum=0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println("the sum is " +sum);
    }
}

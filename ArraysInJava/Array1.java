package ArraysInJava;

public class Array1 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }

        for (int element:arr) {
            System.out.print(element+" ");
        }
    }
}

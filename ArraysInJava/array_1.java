package ArraysInJava;

public class array_1 {
    public static void main(String[] args) {
        int[]marks={98,96,94,92,90};
        //Displaying the array(naive way)
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        //display array (for loop)

        System.out.println("printing using for loop");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        // printing aaray using for each loop
        System.out.println("printing using for each loop");
        for(int element:marks){
            System.out.println(element);
        }


    }
}

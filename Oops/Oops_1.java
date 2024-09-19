package Oops;

class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }

}

public class Oops_1 {
    public static void main(String[] args) {
        Employee rani=new Employee();
        rani.setName("welcome to intellij");
        rani.salary=400;
        System.out.println(rani.getSalary());
        System.out.println(rani.getName());
    }
}

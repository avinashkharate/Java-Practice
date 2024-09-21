package Oops;
class Person_2
{
    String name;
    Person_2(String n)
    {
        name=n;
    }
}
public class Constuctor_parameterized {
    public static void main(String[] args) {
        Person_2 person=new Person_2("NEHA");
        System.out.println("name:" +person.name);


    }
}

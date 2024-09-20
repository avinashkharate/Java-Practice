package Oops;
class Person{
    private String name;
    private int age;
    private String country;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;

    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country=country;
    }

}

public class Getters_Setters {
    public static void main(String[] args) {
        Person person=new Person();
        person.setName("adhira dhobale");
        person.setAge(2);
        person.setCountry("USA");

        String name=person.getName();
        int age=person.getAge();
        String country=person.getCountry();

        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        System.out.println("Country:" +country);

    }

}

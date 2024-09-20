package Oops;
class House{
    private String address;
    private int numberOfRooms;
    private double area;

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public int getnumberOfRooms(){
        return numberOfRooms;
    }
    public void setnumberOfRooms(int numberOfRooms){
        this.numberOfRooms=numberOfRooms;

    }
    public double getArea(){
        return area;
    }
    public void setArea(double area){
        this.area=area;
    }
    public double calculatePrice(double pricePerSquareMeter){
        return area*pricePerSquareMeter;
    }
}

public class Getters_3 {
    public static void main(String[] args) {
        House house=new House();
        house.setAddress("fc road");
        house.setnumberOfRooms(6);
        house.setArea(12.4);

        double price=house.calculatePrice(2000);

        System.out.println("address:" +house.getAddress());
        System.out.println("numberOfRooms:" +house.getnumberOfRooms());
        System.out.println("area:" +house.getArea()+"sq meter");
        System.out.println("price:" +price);




    }
}

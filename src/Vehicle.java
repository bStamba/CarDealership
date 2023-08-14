public class Vehicle {
    String name;
    double price;
    String VIN;

    public Vehicle(String name, double price, String VIN){
        this.name = name;
        this.price = price;
        this.VIN = VIN;
    }

    public double getPrice(){
        return this.price;
    }

    public String getVIN(){
        return VIN;
    }

    public String getName(){
        return name;
    }
}

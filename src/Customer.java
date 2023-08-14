public class Customer {
    private String name;
    private String address;
    private boolean finance;
    private double moneyDown;
    private String purchaseHistory;

    public Customer(String name, String address, double moneyDown){
        this.name = name;
        this.address = address;
        this.moneyDown = moneyDown;
    }

    public Customer(String name, String address, boolean finance, double moneyDown){
        this.name = name;
        this.address = address;
        this.finance = finance;
        this.moneyDown = moneyDown;
    }

    public String getCustomerName(){
        return this.name;
    }

    public String getCustomerAddress(){
        return this.address;
    }

    public double getCustomerMoneyDown(){
        return this.moneyDown;
    }

    public void purchaseCar(Vehicle v, double price){
        this.purchaseHistory = "Customer purchased " + v.getName() + " for " + price + ".";
        System.out.println(purchaseHistory);
    }
}

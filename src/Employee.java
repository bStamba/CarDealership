import java.text.DecimalFormat;

public class Employee {

    String employeeName;
    int employeeID;
    double employeeCommission;
    private static final DecimalFormat decFormat = new DecimalFormat("0.00");

    public Employee(String employeeName, int employeeID){
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }

    public String getEmployeeName(){
        return this.employeeName;
    }

    //Method to see if the customer can afford the vehicle, parameters are the customer,
    //whether they are getting financing, and the vehicle.
    public void runCreditCheck(Customer cust, boolean finance, Vehicle vehicle){
        if(finance == true){
            creditBalance(cust.getCustomerMoneyDown(), vehicle);
        }
        else if(vehicle.getPrice() <= cust.getCustomerMoneyDown()){
            sellVehicle(cust, vehicle);
        }
        else{
            System.out.println("Customer needs more money to purchase the vehicle!");
        }
    }

    //Sell the vehicle to the customer upon approval.
    public void sellVehicle(Customer cust, Vehicle vehicle){
        double carPrice = vehicle.getPrice();
        cust.purchaseCar(vehicle, carPrice);
        System.out.println("Selling vehicle!");
        System.out.println("----------------");
        commission(this.employeeID, vehicle);

    }

    //Calculate the remaining balance that the customer will need financing for.
    public double creditBalance(double moneyDown, Vehicle vehicle){
        double totalRemaining = 0.0;
        totalRemaining = vehicle.getPrice() - moneyDown;
        System.out.println("Customer needs $" + decFormat.format(totalRemaining) + " in financing.");
        return totalRemaining;
    }

    //Employee commission for selling the car.
    public void commission(int employeeID, Vehicle vehicle){
        employeeCommission = vehicle.getPrice() * 0.1;
        System.out.println("Employee commission for: " + getEmployeeName() + ", EmployeeID: " + employeeID +
                           " is: $" + decFormat.format(employeeCommission));
    }
}

public class DealershipMain {

    public static void main(String[] args){

    //Customers
    Customer c1 = new Customer("Mike Jones", "1234 Lawl Blvd.", 100000);
    Customer c2 = new Customer("Brandon Phones", "5287 Ensley Rd", 15000);
    Customer c3 = new Customer("Bongo Jim", "8223 48th Avenue S.", 22500);

    //Vehicles
    Vehicle v1 = new Vehicle("BMW M5", 95999.99, "0123ABCD");
    Vehicle v2 = new Vehicle("Ford F-150", 38999.99, "GGNORE123");
    Vehicle v3 = new Vehicle("Chevrolet Suburban", 55999.99, "CHEESE987");

    //Employees
    Employee e1 = new Employee("Jon Jones", 001);
    Employee e2 = new Employee("Maria Phone", 002);
    Employee e3 = new Employee("Tara Tweet", 003);

    //Running our credit checks to see if the customer can avoid the vehicle, or how much
    //financing the customer will need.
    e1.runCreditCheck(c1, false, v1);
    e2.runCreditCheck(c2, true, v2);
    e3.runCreditCheck(c3, true, v3);
    }
}

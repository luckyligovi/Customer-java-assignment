public class Customer {
    public static void main(String[] args) {
        Customer LocalCustomer = new Customer(200, "Omondi", 2000L, "Kenya","400");
        System.out.println(LocalCustomer.country);
    }


    int accountNo;
    String name;
    long phoneNo;
    String country;
    String address;
    double balance;

    

    // public void deposit(){
    // }

    // public void withdraw(){
    // }

    // public void renew(){
    // }

    // public void checkBalance(){
    // }

    public Customer(int accountNo, String name, long phoneNo, String country, String address, double initialbalance) {
        this.accountNo = accountNo;
        this.name = name;
        this.phoneNo = phoneNo;
        this.country = country;
        this.address = address;
        this.balance = initialbalance;
    }
}


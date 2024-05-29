package assignment;

public class Customer {
    // Attributes
    int accountNo;
    String name;
    long phoneNo;
    String country;
    String address;
    double balance;

    // Constructor
    public Customer(int accountNo, String name, long phoneNo, String country, String address, double initialBalance) {
        this.accountNo = accountNo;
        this.name = name;
        this.phoneNo = phoneNo;
        this.country = country;
        this.address = address;
        this.balance = initialBalance;
    }

    // Methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You have deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void renew() {
        
        System.out.println("You have renewed your account.");
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    public static void main(String[] args) {
        // Creating a customer objects
        Customer localCustomer = new Customer(200, "Omondi", 2000L, "Kenya", "400 Main St", 500.00);
        Customer internationalCustomer = new Customer(400, "Chika", 7986726L, "Egypt", "400 Gaza", 7000.88);

        System.out.println(internationalCustomer.address);


        // Testing the methods
        System.out.println("Customer country: " + localCustomer.country);
        localCustomer.checkBalance();
        localCustomer.deposit(150.0);
        localCustomer.checkBalance();
        localCustomer.withdraw(100.0);
        localCustomer.checkBalance();
        localCustomer.renew();
    }
}

# Customer Account Management System

This Java program represents a simple Customer Account Management System. It includes functionalities for creating customer accounts, depositing and withdrawing funds, checking the balance, and renewing accounts.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The `Customer` class models a bank customer with basic operations such as deposit, withdraw, check balance, and renew account. The program demonstrates object-oriented programming.

## Features

- Create customer accounts with initial balance
- Deposit funds
- Withdraw funds with balance 
- Check current account balance
- Renew account

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or later

### Installation

1. Clone the repository or download the source code.

    ```sh
    git clone https://github.com/your-username/customer-account-management.git
    ```

2. Navigate to the project directory.

    ```sh
    cd customer-account-management
    ```

3. Compile the `Customer` class.

    ```sh
    javac assignment/Customer.java
    ```

4. Run the program.

    ```sh
    java assignment.Customer
    ```

## Usage

The `Customer` class provides the following methods:

- `deposit(double amount)`: Deposits the specified amount into the customer's account.
- `withdraw(double amount)`: Withdraws the specified amount from the customer's account, if sufficient balance is available.
- `checkBalance()`: Prints the current account balance.
- `renew()`: Prints a message indicating the account has been renewed.

### Example

Here's an example of how to create customer accounts and perform various operations:

```java
public static void main(String[] args) {
    // Creating customer objects
    Customer localCustomer = new Customer(200, "Kipyegon", 2000L, "Kenya", "400 Main St", 500.00);
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

package com.maymai;

public class BankAccount {
    private double balance;
    private String number;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String number, double balance, String customerName,
                       String phoneNumber, String email) {
        // It is best practice to have a main constructor that is called by other constructors
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        // With constructors it's better not to call setters
        // since with inherited classes they may not be executed.
        // Also, constructors are the first bit of code executed,
        // therefore it is best to avoid calling other methods within constructors.
        System.out.println("Account Created! \n" +
                "Account number: " + this.number + "\n" +
                "Account holder: " + this.customerName + "\n" +
                "Account balance: " + this.balance);
    }

    public BankAccount() {
        this("John Doe",
                "123-456", "mymail@mail.com");
        // Has to be the first statement to be executed!!!
        // This create default values for the variables if no parameter is given,
        // but what about if not all are given?
        // Answer: create a new constructor for each possibility,
        // Overflowing takes care of the rest.
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("000-000-000", 00.00, customerName, phoneNumber, email);
    }

    public void setBalance(double value) {
        this.balance = value;
    }
    public void setAccount(String accNumber) {
        this.number = accNumber;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String newEmail) {
        this.email = newEmail;
    }
    public void setPhoneNumber(String newPhone) {
        this.phoneNumber = newPhone;
    }
    public String getNumber() {
        return this.number;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void deposit(double value) {
        System.out.println("Depositing £" + String.format("%.2f", value));
        setBalance(getBalance() + value);
        System.out.println("Your new balance is £" + String.format("%.2f", getBalance()));
    }
    public void withdraw(double value) {
        System.out.println("Withdrawing £" + String.format("%.2f", value));
        double currentBalance = getBalance();
        if(currentBalance - value < 0) {
            System.out.println("Your current balance is £" +
                    String.format("%.2f", getBalance()) +
                    ". You cannot withdraw more than your current balance.");

        } else {
            setBalance(currentBalance - value);
            System.out.println("Your new balance is £" + String.format("%.2f", getBalance()));
        }
    }
}

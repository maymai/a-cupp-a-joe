package com.maymai;

public class Main {

    public static void main(String[] args) {
	    BankAccount account = new BankAccount();
	    // new class_name() calls the constructor
        System.out.println("The account holder name is set to " +
                account.getCustomerName());
        System.out.println("Your account number is " +
                account.getNumber());
        System.out.println("Your phone number is set to " +
                account.getPhoneNumber());
        System.out.println("Your email is set to " + account.getEmail());
        System.out.println("Current balance is " + account.getBalance());
        account.deposit(123.56);
        account.withdraw(20.25);
        account.withdraw(2000);

        BankAccount account1= new BankAccount("987-654-321",
                10.0, "John Doe", "9876-5432",
                "lalala@mail.com");
        // Constructor can be overloaded, but how do you allow for empty values?
        System.out.println("Account 1 balance is " + account1.getBalance());
        account1.withdraw(20);
        account1.deposit(15);
        account1.withdraw(25);

        BankAccount account2 = new BankAccount("Jane Doe",
                "jane@email.com", "456-123");
    }
}

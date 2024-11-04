package Contructor;
/*
_Constructor with Validation
    Write a Java program to create a class called Account with instance variables accountNumber and balance.
    Implement a parameterized constructor that initializes these variables with validation:

+ accountNumber should be non-null and non-empty.
+ balance should be non-negative.
+ Print an error message if the validation fails.
*/

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.err.println("Account number cannot be empty");
            return;
        }

        if (balance < 0 ) {
            System.err.println("Balance cannot be negative");
            return;
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }



    static class Register {
        private String name;
        private String password;
        private String address;
        private double amount;

        public Register(String name, String password, String address, double amount) {
            if (name == null || name.isEmpty()) {
                System.err.println("Name cannot be empty");
            }

            if (password == null || password.isEmpty()) {
                System.err.println("Password cannot be empty");
            }

            if (address == null || address.isEmpty()) {
                System.err.println("Address cannot be empty");
            }

            if (amount < 0) {
                System.err.println("Amount cannot be negative");
            }
            this.name = name;
            this.password = password;
            this.address = address;
            this.amount = amount;
        }

        public void PrintDetails() {
            System.out.println("Name: " + name);
            System.out.println("Password: " + password);
            System.out.println("Address: " + address);
            System.out.println("Amount: " + amount);

        }

    }

    public static void main (String[] args) {

        Register register1 = new Register("Samuel", "234342","MeanChey", 330);
        Register register2 = new Register("HengSOk", "234121", "Boung Keng Kong", 340);
        Register register3 = new Register("James", "2341sdfs21", "Boun Kong", 200);
        Account user1 = new Account("12325452345", 120);
        Account user2 = new Account("35235623", 1000);
        Account user3 = new Account("", 0);

        int total = (int) (user1.balance + register1.amount);
        register1.PrintDetails();
        System.out.println("User Account List");
        System.out.println("AccountNumber:" + user1.accountNumber);
        System.out.println("balance:" + user1.balance);
        System.out.println("Total:" + total);

        System.out.println("====================");
        register2.PrintDetails();
        int total2 = (int) (user2.balance + register2.amount);
        System.out.println("AccountNumber:" + user2.accountNumber);
        System.out.println("balance:" + user2.balance);
        System.out.println("Total:" + total2);

        System.out.println("====================");
        register3.PrintDetails();
        int total3 = (int) (user3.balance + register3.amount);
        System.out.println("AccountNumber:" + user3.accountNumber);
        System.out.println("balance:" +user3.balance);
        System.out.println("Total:" + total3);
    }
}

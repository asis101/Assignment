package assignment7;

import java.util.Scanner;

public class BankAccount {

    public String name;
    public double initialBalance;
    public static int accountNumber = 1001000;

    public BankAccount(String name) {
        this.name = name;
        initialBalance = 0;
        accountNumber++;
    }
    public BankAccount(String name, double initialBalance) {
        this.name = name;
        this.initialBalance = initialBalance;
        accountNumber++;
    }

    public void withdrawFund(double amount) {
        initialBalance = initialBalance - amount;
        System.out.println("Withdraw Amount: " + amount);
        displayBalance();
    }
    public void withdrawFund(double amount, double fee) {
        initialBalance = initialBalance - amount - fee;
        System.out.println("Withdraw Amount: " + amount);
        displayBalance();
    }

    public void depositFund(double amount) {
        initialBalance = initialBalance + amount;
        System.out.println("Deposit Amount: " + amount);
        displayBalance();
    }
    public void depositFund(double amount, double interestRate) {
        initialBalance = initialBalance + amount + (initialBalance * interestRate / 100);
        System.out.println("Deposit Amount: " + amount);
        displayBalance();
    }

    public void showMenu() {
        double amount, rate, fee;
        int option;



        do{
            System.out.println();
            System.out.println("What would you like to do? Please select the option");
            System.out.println("\t 1. Deposit amount only.");
            System.out.println("\t 2. Deposit amount with interest rate.");
            System.out.println("\t 3. Withdraw amount only.");
            System.out.println("\t 4. Withdraw amount with deduction fee.");
            System.out.println("\t 5. Exit");
            System.out.println();

            System.out.println("Enter option");
            Scanner input = new Scanner(System.in);
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("========");
                    System.out.println("Enter amount to deposit");
                    amount = input.nextDouble();
                    depositFund(amount);
                    break;
                case 2:
                    System.out.println("========");
                    System.out.println("Enter amount to deposit");
                    amount = input.nextDouble();
                    System.out.println("Enter the interest rate");
                    rate = input.nextDouble();
                    depositFund(amount, rate);
                    break;
                case 3:
                    System.out.println("========");
                    System.out.println("Enter amount to withdraw");
                    amount = input.nextDouble();
                    withdrawFund(amount);
                    break;
                case 4:
                    System.out.println("========");
                    System.out.println("Enter amount to withdraw");
                    amount = input.nextDouble();
                    System.out.println("Enter deduction fee");
                    fee = input.nextDouble();
                    withdrawFund(amount, fee);
                    break;
                case 5:
                    System.out.println("========");
                    System.out.println("Thank You");
                    break;
                default:
                    System.out.println("Wrong option");
            }
        } while (option != 5);
    }

    public void displayInfo() {
        System.out.println("========");
        System.out.println("Account Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("========");
    }
    public void displayBalance() {
        System.out.println("========");
        System.out.printf("Account Balance: %.3f\n", initialBalance);
        System.out.println("========");
    }
}

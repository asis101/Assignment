package assignment7;

import java.util.Scanner;

public class BankTest {

    public static void main(String[] args) {
        BankAccount account = null;

        System.out.println("Welcome To Bank");
        System.out.println();
        System.out.println("=============");
        System.out.println("Create an Account, with following option");
        System.out.println("\t 1. Account with name only");
        System.out.println("\t 2. Account with name and initial balance");
        System.out.println("=============");
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your option");
        int option = input.nextInt();

        String name;
        double balance;
        switch (option) {
            case 1:
                System.out.println("Enter account's holder name");
                name = input.next();
                account = new BankAccount(name);
                account.displayInfo();
                account.showMenu();
                break;
            case 2:
                System.out.println("Enter account's holder name");
                name = input.next();
                System.out.println("Enter initial balance");
                balance = input.nextDouble();
                account = new BankAccount(name, balance);
                account.displayInfo();
                account.showMenu();
                break;
            default:
                System.out.println("Wrong Option");
        }


    }
}

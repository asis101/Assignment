package project1;

import sun.security.mscapi.CPublicKey;

import java.util.Scanner;

public class TakeOut {

    public static void main(String[] args) {
        int people, feeds, trays, leftOver;
        double price, subTotal, tax, tip, total, perPerson;
        double taxRate = 7;
        double tipRate = 15;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of people for order:");
        people = input.nextInt();

        if (people >= 10) {
            displayMainMenu();
            int menuChoice;
            int foodChoice;
            menuChoice = input.nextInt();
            switch (menuChoice) {
                case 1:
                    displayItalianFoodMenu();
                    foodChoice = input.nextInt();
                    switch (foodChoice) {
                        case 1:
                            feeds = 5;
                            price = 17.99;
                            trays = determineTrays(people, feeds);
                            subTotal = getSubtotal(price, trays);
                            tax = getTax(subTotal, taxRate);
                            tip = getTip(subTotal, tipRate);
                            total = grandTotal(subTotal, tax, tip);
                            perPerson = pricePerPerson(total, people);
                            leftOver = determineLeftOvers(feeds, trays, people);
                            display(people, trays, feeds, subTotal, tax, tip, total, perPerson, leftOver);
                            break;
                        case 2:
                            feeds = 7;
                            price = 15.99;
                            trays = determineTrays(people, feeds);
                            subTotal = getSubtotal(price, trays);
                            tax = getTax(subTotal, taxRate);
                            tip = getTip(subTotal, tipRate);
                            total = grandTotal(subTotal, tax, tip);
                            perPerson = pricePerPerson(total, people);
                            leftOver = determineLeftOvers(feeds, trays, people);
                            display(people, trays, feeds, subTotal, tax, tip, total, perPerson, leftOver);
                            break;
                        case 3:
                            feeds = 4;
                            price = 12.99;
                            trays = determineTrays(people, feeds);
                            subTotal = getSubtotal(price, trays);
                            tax = getTax(subTotal, taxRate);
                            tip = getTip(subTotal, tipRate);
                            total = grandTotal(subTotal, tax, tip);
                            perPerson = pricePerPerson(total, people);
                            leftOver = determineLeftOvers(feeds, trays, people);
                            display(people, trays, feeds, subTotal, tax, tip, total, perPerson, leftOver);
                            break;
                        default:
                            System.out.println("invalid choice");
                    }
                    break;
                case 2:
                    displayChineseFoodMenu();
                    foodChoice = input.nextInt();
                    switch (foodChoice) {
                        case 1:
                            feeds = 7;
                            price = 18.99;
                            trays = determineTrays(people, feeds);
                            subTotal = getSubtotal(price, trays);
                            tax = getTax(subTotal, taxRate);
                            tip = getTip(subTotal, tipRate);
                            total = grandTotal(subTotal, tax, tip);
                            perPerson = pricePerPerson(total, people);
                            leftOver = determineLeftOvers(feeds, trays, people);
                            display(people, trays, feeds, subTotal, tax, tip, total, perPerson, leftOver);
                            break;
                        case 2:
                            feeds = 7;
                            price = 18.99;
                            trays = determineTrays(people, feeds);
                            subTotal = getSubtotal(price, trays);
                            tax = getTax(subTotal, taxRate);
                            tip = getTip(subTotal, tipRate);
                            total = grandTotal(subTotal, tax, tip);
                            perPerson = pricePerPerson(total, people);
                            leftOver = determineLeftOvers(feeds, trays, people);
                            display(people, trays, feeds, subTotal, tax, tip, total, perPerson, leftOver);
                            break;
                        case 3:
                            feeds = 5;
                            price = 10.99;
                            trays = determineTrays(people, feeds);
                            subTotal = getSubtotal(price, trays);
                            tax = getTax(subTotal, taxRate);
                            tip = getTip(subTotal, tipRate);
                            total = grandTotal(subTotal, tax, tip);
                            perPerson = pricePerPerson(total, people);
                            leftOver = determineLeftOvers(feeds, trays, people);
                            display(people, trays, feeds, subTotal, tax, tip, total, perPerson, leftOver);
                            break;
                        default:
                            System.out.println("invalid choice");
                    }
                    break;
                case 3:
                    displayAmericanFoodMenu();
                    foodChoice = input.nextInt();
                    switch (foodChoice) {
                        case 1:
                            feeds = 8;
                            price = 21.99;
                            trays = determineTrays(people, feeds);
                            subTotal = getSubtotal(price, trays);
                            tax = getTax(subTotal, taxRate);
                            tip = getTip(subTotal, tipRate);
                            total = grandTotal(subTotal, tax, tip);
                            perPerson = pricePerPerson(total, people);
                            leftOver = determineLeftOvers(feeds, trays, people);
                            display(people, trays, feeds, subTotal, tax, tip, total, perPerson, leftOver);
                            break;
                        case 2:
                            feeds = 5;
                            price = 22.99;
                            trays = determineTrays(people, feeds);
                            subTotal = getSubtotal(price, trays);
                            tax = getTax(subTotal, taxRate);
                            tip = getTip(subTotal, tipRate);
                            total = grandTotal(subTotal, tax, tip);
                            perPerson = pricePerPerson(total, people);
                            leftOver = determineLeftOvers(feeds, trays, people);
                            display(people, trays, feeds, subTotal, tax, tip, total, perPerson, leftOver);
                            break;
                        case 3:
                            feeds = 10;
                            price = 26.99;
                            trays = determineTrays(people, feeds);
                            subTotal = getSubtotal(price, trays);
                            tax = getTax(subTotal, taxRate);
                            tip = getTip(subTotal, tipRate);
                            total = grandTotal(subTotal, tax, tip);
                            perPerson = pricePerPerson(total, people);
                            leftOver = determineLeftOvers(feeds, trays, people);
                            display(people, trays, feeds, subTotal, tax, tip, total, perPerson, leftOver);
                            break;
                        default:
                            System.out.println("invalid choice");
                    }
                    break;
                default:
                    System.out.println("invalid choice");
            }
        } else {
            System.out.println("Number of people invalid");
        }

    }

    public static void displayMainMenu() {
        System.out.println("CHOOSE TYPE MEAL");
        System.out.println("________________");
        System.out.println("1. Italian");
        System.out.println("2. Chinese");
        System.out.println("3. American");
        System.out.println("Choose what type of food you'd like to order");
    }

    public static void displayItalianFoodMenu() {
        System.out.println("CHOOSE ONE");
        System.out.println("________________");
        System.out.println("1. Lasagna Tray - Feeds 5 - 17.99");
        System.out.println("2. Pizza Pack - Feeds 7 - 15.99");
        System.out.println("3. Gazpacho Soup, salad and bread sticks pack - Feeds 4 - 12.99");
        System.out.println("Enter Choice");
    }

    public static void displayChineseFoodMenu() {
        System.out.println("CHOOSE ONE");
        System.out.println("________________");
        System.out.println("1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls) - feeds 7 - 18.99");
        System.out.println("2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls) - feeds 7 - 18.99");
        System.out.println("3. Shrimp Fried Rice Tray (includes 10 egg rolls) - Feeds 5 - 10.99");
        System.out.println("Enter Choice");
    }

    public static void displayAmericanFoodMenu() {
        System.out.println("CHOOSE ONE");
        System.out.println("________________");
        System.out.println("1. Hamburger and Hot Dog Tray - includes buns and condiments - feeds 8 - 21.99");
        System.out.println("2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces -Feeds 5 -\n" +
                "22.99");
        System.out.println("3. Barbeque Tray - includes buns and peach cobbler - Feeds 10 - 26.99");
        System.out.println("Enter Choice");
    }

    public static int determineTrays(int people, int feeds) {
        if (people % feeds != 0) {
            return (people / feeds + 1);
        }
        return (people / feeds);
    }

    public static double getSubtotal(double price, int trays) {
        return (price * trays);
    }

    public static double getTax(double subTotal, double taxRate) {
        return (subTotal * taxRate / 100);
    }

    public static double getTip(double subTotal, double tipRate) {
        return (subTotal * tipRate / 100);
    }

    public static double grandTotal(double subTotal, double tax, double tip) {
        return (subTotal + tax + tip);
    }

    public static double pricePerPerson(double grandTotal, int people) {
        return (grandTotal / people);
    }

    public static int determineLeftOvers(int feeds, int trays, int people) {
        return ((trays * feeds) - people);
    }

    public static void display(int people, int trays, int feeds, double price, double tax,
                               double tip, double total, double perPerson, int leftOver) {
        System.out.println("You need " + trays + " trays");
        System.out.println("Feeds: " + feeds);
        System.out.printf("Price for %d people (%d trays): $%.2f\n",people, trays, price);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Tip: $%.2f\n", tip);
        System.out.printf("Total(food, tax, tip): $%.2f\n", total);
        System.out.printf("Price per person: $%.2f\n", perPerson);
        System.out.println("Leftover serving for the delivery person: " + leftOver);
    }
}

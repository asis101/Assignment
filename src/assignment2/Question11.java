package assignment2;

public class Question11 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("First number is: " + a);
        System.out.println("Second number is: " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping:");
        System.out.println("First number is: " + a);
        System.out.println("Second number is: " + b);

    }
}

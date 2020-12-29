package assignment2;

public class Question10 {
    public static void main(String[] args) {
        double u = 12.2;
        double t = 56;
        double a = 45;
        double d = u * t + 0.5 * a * Math.pow(t, 2);
        System.out.println("s = " + d);

        double s = 6;
        double a1 = 3;
        double b = 4;
        double c = 2;
        double area = Math.sqrt(s * (s - a1) * (s - b) * (s - c));
        System.out.println("area = " + area);

        double a2 = 3;
        double b1 = 5;
        double c1 = 2;
        double x = (-b1 + Math.sqrt(b1 * b1 - 4 * a2 * c1)) / 2 * c1;
        System.out.println("x = " + x);

    }
}

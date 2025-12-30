public class Utilitymethods {
    static int add(int a, int b) {
        return a + b;
    }
    static int square(int n) {
        return n * n;
    }
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    static double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }


    public static void main(String[] args) {

        System.out.println("Addition: " + add(10, 20));
        System.out.println("Square: " + square(5));
        System.out.println("Is Even: " + isEven(8));
        System.out.println("Max: " + max(15, 9));
        System.out.println("Simple Interest: " + simpleInterest(1000, 5, 2));
    }
}


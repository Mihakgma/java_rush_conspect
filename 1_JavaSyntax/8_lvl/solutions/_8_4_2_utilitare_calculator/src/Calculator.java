public class Calculator {
    public static void add(int a, int b, String eq) {
        System.out.println(a + " + " + b + eq + (a + b));
    }

    public static void subtract(int a, int b, String eq) {
        System.out.println(a + " - " + b + eq + (a - b));
    }

    public static void multiply(int a, int b, String eq) {
        System.out.println(a + " * " + b + eq + (a * b));
    }

    public static void divide(int a, int b, String eq) {
        System.out.println(a + " / " + b + eq + (a / b));
    }
}

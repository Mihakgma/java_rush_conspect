public class Main {
    public static final String EQUAL = " = ";
    public static void main(String[] args) {
        int a = 45;
        int b = 15;
//        Main.Calc calc = new Main.Calc();
        Calc.add(a, b);
        Calc.subtract(a, b);
        Calc.multiply(a, b);
        Calc.divide(a, b);
//        Calculator.add(a, b, EQUAL);
//        Calculator.subtract(a, b, EQUAL);
//        Calculator.multiply(a, b, EQUAL);
//        Calculator.divide(a, b, EQUAL);
//        System.out.println("Hello world!");
    }
    public static class Calc {
        public static final String EQUAL = " =|= ";
        public static void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }

        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }

        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }

        public static void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }
    }
}

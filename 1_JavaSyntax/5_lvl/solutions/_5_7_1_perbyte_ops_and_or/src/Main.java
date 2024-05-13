public class Main {
    public static void main(String[] args) {
        int x = 7;
        byteForm(x);
        byteForm(25);
//        x = x & 25;
        byteForm(x);
        byteForm(5);
        x = x & 5;
        byteForm(x);
//        x = x & 3;
        x = x & 12;
        x = x | 1;
        System.out.println(x);
//        System.out.println("Hello world!");
    }

    public static void byteForm(int number) {
        int module = (int) Math.pow(2, 30);
        while (module > number) {
            module >>= 1;
        }
        System.out.print("The Number " + number + " in bit presentation: ");
        while (module > 0) {
            System.out.print(number / module > 0 ? 1 : 0);
            number %= module;
            module >>= 1;
        }
        System.out.println();
    }
}

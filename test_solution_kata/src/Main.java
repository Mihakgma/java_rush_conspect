import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(checkDigits(x, y));
    }
    public static String checkDigits(int x, int y) {
        String s;
        if (x < y) {
            s = "Первое число меньше второго.";
        } else if (x > y) {
            s = "Второе число меньше первого.";
        } else s = "Числа - равны.";
        return s;
    }
}

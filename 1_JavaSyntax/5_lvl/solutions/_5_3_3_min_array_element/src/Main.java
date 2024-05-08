import java.util.Scanner;

public class Main {
    public static int min(int[] ints) {
        //напишите тут ваш код
        int min = ints[0];
        for (int i = 0; i < ints.length; i ++) {
            if (i > 0) {
                int j = Math.min(ints[i - 1], ints[i]);
                if (j < min) {
                    min = j;
                }
            }
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));

        System.out.println("Hello world!");
    }
}
/**
 * @author Mikhail Tabakaev
 * @
 * theme: Reverse Data (Containers)
 * These code helps to understand how to work with javadoc
 * and to see difference between ArrayList vs basic java Arrays
 * @see //javarush.com/quests/lectures/questsyntaxpro.level12.lecture02
 */
import java.util.ArrayList;

public class Main {
//    public static int[] numbers = new int[10];
    public static ArrayList<Integer> numbers = new ArrayList<Integer>(10);

    public static void main(String[] args) {
        init();
//        print();

        reverse();
        print();
    }
/***
 * @deprecated The newer version of the method has name init()
 * @see Main#init()
 */
    public static void initArray(int[] array) {
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    /**
     * @deprecated Please, use the right version of the method
     * @see Main#reverse()
     */
    public static void reverseArray(int[] array) {
        int n = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i];
            array[n - i] = temp;
        }
    }

    public static void reverse() {
        int n = numbers.size() - 1;
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(n - i));
            numbers.set(n - i, temp);
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
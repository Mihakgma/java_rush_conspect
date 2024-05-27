import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float f[] = new float[10];
        for (int i = 0; i < 10; i++) {
            f[i] = rand.nextFloat();
        }
        for (float x: f) {
            print(x);
        }
        print("\n");
        for (int x: range(10)) {
            print(x);
        }
//        print("Hello world!");
    }
    static void print(Object obj) {
        System.out.println(obj);
    }
    /*
    * Simple generator range() realization without overloading possibilities...
    * */
    static public int[] range(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i;
        }
        return array;
    }
}

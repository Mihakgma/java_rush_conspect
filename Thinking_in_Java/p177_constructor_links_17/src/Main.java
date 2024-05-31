import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SomeClass[] array = new SomeClass[10];
//        SomeClass[] array = new SomeClass[]{
//            SomeClass(""),
//        }; // not working lke that!!!
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = new SomeClass((String) ("string = " + i));
        }
        System.out.println(Arrays.toString(array));
    }
}

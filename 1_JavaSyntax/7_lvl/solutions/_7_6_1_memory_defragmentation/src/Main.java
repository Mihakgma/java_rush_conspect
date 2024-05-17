import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
//        System.out.println("Hello world!");
    }
    public static void executeDefragmentation(String[] array) {
        //напишите тут ваш код
        String[] memoryDefragmented = new String[array.length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                memoryDefragmented[counter] = array[i];
                counter++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = memoryDefragmented[i];
        }
    }
}
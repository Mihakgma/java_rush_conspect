import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Collections.addAll(list, "Hello, ", "how ", "are ", "you?");
        list.forEach((s) -> System.out.println(s));
        list.forEach(s-> System.out.println(s));
        list.forEach(System.out::println);
        // compiler transform the code above in:
//        list.forEach(new Consumer<String>()
//        {
//            public void accept(String s)
//            {
//                System.out.println(s);
//            }
//        });
        // Создаем список целых чисел
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, -777232));

        // Используем ссылку на конструктор int[]::new для создания массива
        Integer[] intArray = numbers.toArray(Integer[]::new);

        // Вывод массива
        System.out.println("Массив int[]: " + Arrays.toString(intArray));
    }
}

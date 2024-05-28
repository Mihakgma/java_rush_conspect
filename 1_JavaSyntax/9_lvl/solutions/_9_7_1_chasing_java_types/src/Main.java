import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("Привет");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);
    }
    public static void checkElementsType(ArrayList<Object> elements) {
        for (Object elem: elements) {
//            print(elem.getClass().getName());
            var s = elem.getClass().getName();
            if (s.contains("String")) {
                printString();
            } else if (s.contains("Integer") && s.contains("[")) {
                printIntegerArray();
            } else if (s.contains("Integer")) {
                printInteger();
            } else {
                printUnknown();
            }
        }
    }

    public static void printString() {
        print("Строка");
    }

    public static void printInteger() {
        print("Целое число");
    }

    public static void printIntegerArray() {
        print("Массив целых чисел");
    }

    public static void printUnknown() {
        print("Другой тип данных");
    }
    static void print(Object obj) {
        System.out.println(obj);
    }
}

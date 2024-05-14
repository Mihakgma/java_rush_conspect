import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;

public class Main {
    public static HashMap map = new HashMap();
    public static String[] keys = {
            ".jpg",
            ".jpeg",
            ".htm",
            ".html",
            ".doc",
            ".docx"
    };
    public static String[] values = {
            "Это - Jpeg!",
            "Это - Jpeg!",
            "Это - HTML-страница",
            "Это - HTML-страница",
            "Это - документ Word",
            "Это - документ Word"
    };
    public static void main(String[] args) {
        if (keys.length != values.length) {
            System.out.println("Arrays' lengths are supposed to be equal!!!");
            return;
        }
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
        printDictPairs();
        System.out.println(checkFileFormat());
        System.out.println("Hello world!");
    }
    public static void printDictPairs() {
        Set keysSet = map.keySet();
        System.out.println("All keys are: " + keysSet);
// To get all key: value
        for(int i = 0; i < keys.length; i++){
            String key = keys[i];
            System.out.println(key + ": " + map.get(key));
        }
    }
    public static Object checkFileFormat() {
//        Set keysSet = map.keySet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите наименование файла для проверки формата:");
        String fileName = scanner.nextLine();
        for (int i = 0; i < keys.length; i++) {
            String k = keys[i];
            if (fileName.endsWith(k)) {
                return map.get(k);
            };
        }
        System.out.println("File format for <" + fileName + "> is absent in my list!!!");
        return "";
    }
}
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
        System.out.println(packagePath);
//        System.out.println("Hello world!");
    }
    public static String[] getTokens(String query, String delimiter) {
        //напишите тут ваш код
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] tknArray = new String[tokenizer.countTokens()];
        int counter = 0;
        while (tokenizer.hasMoreTokens())
        {
            tknArray[counter] = tokenizer.nextToken();
            counter++;
        }
        return tknArray;
    }
}

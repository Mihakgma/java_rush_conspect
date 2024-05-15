import java.util.StringTokenizer;

public class Main {
    public static String str = "Good news everyone!";
    public static void main(String[] args) {
        StringTokenizer tokenizer = new StringTokenizer(str, "ne");
        System.out.println(tokenizer.getClass());
        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            System.out.println(token);
            System.out.println(token.getClass());
        }
        System.out.println("Hello world!");
    }
}

import java.util.Arrays;

public class Main {
    public static int[] cript(int[] data, int password) {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            result[i] = data[i] ^ password;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] data = {1231, 22, 32, 333, 1, -78};
        int pass = 666;

        System.out.println("Encryption process started");
        int[] encrypted = cript(data, pass);
        System.out.println(Arrays.toString(encrypted));

        System.out.println("Decryption process started");
        int[] decrypted = cript(encrypted, pass);
        System.out.println(Arrays.toString(decrypted));

        int a = 5;
        int b = ++a + ++a;
        System.out.println(b);
//        System.out.println("Hello world!");
    }
}

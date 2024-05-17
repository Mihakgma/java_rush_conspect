import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class<Shark> shark = Shark.class;
        System.out.println(shark);
        System.out.println(shark.getClass());
        System.out.println(shark.descriptorString());
        System.out.println(Arrays.toString(shark.getAnnotations()));
        System.out.println(shark.getConstructors());
        Class a = String.class;
        System.out.println(a);
    }
}

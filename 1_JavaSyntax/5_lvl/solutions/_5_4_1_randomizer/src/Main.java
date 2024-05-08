public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(generateNumber());
        }
//        System.out.println("Hello world!");
    }
    public static int generateNumber() {
        //напишите тут ваш код
        int digit = (int) (Math.random() * 100);
        if (digit < 100) {
            return digit;
        }
        return 99;
    }
}
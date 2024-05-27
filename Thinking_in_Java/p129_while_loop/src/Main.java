public class Main {
    public static int counter = 0;
    public static void main(String[] args) {
        while (condition()) {
            counter++;
            print("Inside while");
        }
        print("\nWhile loop worked for <" + counter + "> iterations");
    }
    static boolean condition() {
        boolean result = Math.random() < 0.99;
        print(result + ", ");
        return result;
    }
    static void print(Object obj) {
        System.out.println(obj);
    }
}

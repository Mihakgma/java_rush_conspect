public class Main {
    public static void main(String[] args) throws InterruptedException {
        printNumbers();
//        System.out.println("Hello world!");
    }
    public static void printNumbers() throws InterruptedException {
        int counter = 0;
        for (int i = 1; i < 11; i++) {
            if (i != 1) {
                counter++;
                Thread.sleep(1, 300_000);
            }
            System.out.println(i);
        }
        System.out.println("Пауза сработала " + counter + " раз.");
    }
}
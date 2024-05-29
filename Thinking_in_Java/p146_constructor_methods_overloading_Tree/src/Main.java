public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("Overloaded method");
        }
        System.out.println("\nOverloaded constructor:");
        new Tree();
    }
}

public class Main {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // proper clean up
        novel.checkIn();
        // loosing a link, forget to clean up
        new Book(true);
        // forced cleaning up rubbish & finalization
        System.gc();
    }
}

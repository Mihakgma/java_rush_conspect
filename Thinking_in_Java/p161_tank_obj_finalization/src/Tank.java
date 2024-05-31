public class Tank {
    private boolean isFull;
    private Object object;

    public void fullTank() {
        isFull = true;
        print("Tank has been fulled");
    }
    public void emptyTank() {
        isFull = false;
        print("Tank got emptied");
    }
    @Override
    public void finalize() {
        if (isFull) {
            print("Tank is fulfilled with gas. Cannot finalize it right now...");
        }
    }
    static void print(Object obj) {
        System.out.println(obj);
    }
}

public class Main {
    public static int iters = 33;
    public static Cycle[] s = new Cycle[iters];
    public static void main(String[] args) {
        CycleCreator creator = new CycleCreator(iters);
        for (int i = 1; i < iters; i++) {
            s[i] = creator.next();
            s[i].ride();
        }
    }
}

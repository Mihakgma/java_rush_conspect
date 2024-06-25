public class Soap {
    private String s;
    Soap() {
        Main.print("Soap()");
        s = "constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

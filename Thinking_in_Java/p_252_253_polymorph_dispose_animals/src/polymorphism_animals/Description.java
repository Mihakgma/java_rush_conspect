package polymorphism_animals;

public class Description {
    private final String s;
    Description(String s) {
        this.s = s;
    }
    protected void dispose() {
        Main.print("Finalizing Description " + s);
    }
}

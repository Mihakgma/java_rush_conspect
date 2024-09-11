package polymorphism_animals;

public class Description {
    private String s;
    Description(String s) {
        this.s = s;
    }
    protected void dispose() {
        Main.print("Finalizing Description " + s);
    }
}

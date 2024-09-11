package polymorphism_animals;

public class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        Main.print("Creating Characteristic " + s);
    }

    protected void dispose() {
        Main.print("Finalizing Characteristic " + s);
    }
}

package polymorphism_animals;

public class Characteristic extends Shared {
    private final String s;

    Characteristic(String s) {
        this.s = s;
        Main.print("Creating Characteristic: " + s);
    }

    protected void dispose() {
        delRef();
        if (getRefCount() == 0) {
            Main.print("Finalizing " + this + s + ">");
        }
    }
}

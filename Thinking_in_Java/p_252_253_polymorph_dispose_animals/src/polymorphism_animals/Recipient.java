package polymorphism_animals;

public class Recipient {
    private final Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Recipient(Shared shared) {
        Main.print("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        Main.print("Disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Recipient id = " + id;
    }
}

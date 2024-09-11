package polymorphism_animals;

public class Amphibian extends Animal {
    private Characteristic p = new Characteristic("can live in water");
    private Description t = new Description("both in water as on ground");

    Amphibian() {
        Main.print("Amphibian()");
    }

    protected void dispose() {
        Main.print("dispose in Amphibian ");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

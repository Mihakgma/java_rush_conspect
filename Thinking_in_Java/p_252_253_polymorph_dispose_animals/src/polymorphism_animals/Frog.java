package polymorphism_animals;

public class Frog extends Amphibian{
    private Characteristic p = new Characteristic("kwaaaks");
    private Description t = new Description("eats bugs");
    public Frog() {
        Main.print("Frog()");
    }

    protected void dispose() {
        Main.print("dispose in Frog ");
        t.dispose();
        p.dispose();
        super.dispose();
    }

}

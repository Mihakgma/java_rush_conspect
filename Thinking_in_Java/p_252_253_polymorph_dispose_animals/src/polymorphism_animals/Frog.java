package polymorphism_animals;


public class Frog extends Amphibian{
    static final String classIdentifier = RandomString.generateString();
    final String location;
    private Characteristic p = new Characteristic("kwaaaks");
    private Description t = new Description("eats bugs");
    public Frog(String location) {
        this.location = location;
        Main.print("Frog()");
    }

    protected void dispose() {
        Main.print("dispose in Frog ");
        t.dispose();
        p.dispose();
        super.dispose();
    }

}

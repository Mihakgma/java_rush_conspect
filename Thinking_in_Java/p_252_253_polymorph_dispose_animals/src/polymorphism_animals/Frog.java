package polymorphism_animals;


import java.util.Objects;

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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Frog frog)) return false;
        return Objects.equals(location, frog.location) && Objects.equals(p, frog.p) && Objects.equals(t, frog.t);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, p, t);
    }
}

package polymorphism_animals;

public class LivingCreature {
    private Characteristic p = new Characteristic("living creature");
    private Description t = new Description("General living creature");

    LivingCreature() {
        Main.print("LivingCreature()");
    }

    protected void dispose() {
        Main.print("dispose() in LivingCreature");
        t.dispose();
        p.dispose();
    }
}

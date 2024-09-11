package polymorphism_animals;

public class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("has heart");
    private Description t = new Description("an animal not a plant");

    Animal() {
        Main.print("Animal");
    }

    protected void dispose() {
        Main.print("dispose in Animal ");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

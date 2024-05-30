public class Parasite extends BasicAnimal{
    protected String name;
    public Legs legs;
    public Parasite(String name, Legs legs) {
        super(legs);
        this.name = name;
    }
    public void move() {
        System.out.println("Parasite " + this.name + " ambushes quickly");
    }
    public String getName() {
        return name;
    }
}

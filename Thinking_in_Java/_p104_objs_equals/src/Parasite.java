public class Parasite extends BasicAnimal{
    protected String name;
    public Legs legs;
    public Parasite(String name, Legs legs) {
        super(legs);
        super.setName(name);
    }
    public void move() {
        System.out.println("Parasite " + getName() + " ambushes quickly");
    }
//    public String getName() {
//        return name;
//    }
}

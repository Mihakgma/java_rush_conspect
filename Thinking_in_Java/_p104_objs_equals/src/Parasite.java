public class Parasite extends BasicAnimal{
    public String name;
    private double weigthKg;
    public Parasite(String name) {
        super();
        this.name = name;
    }
    public void move() {
        System.out.println("Parasite " + this.name + " ambushes quickly");
    }
}

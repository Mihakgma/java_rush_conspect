public class Parasite extends BasicAnimal{
    String name;
    private double weigthKg;
    public Parasite(String name) {
        this.name = name;
        this.weigthKg = minKgWeight;
    }
    public void move() {
        System.out.println("Parasite " + this.name + " ambushes quickly");
    }
}

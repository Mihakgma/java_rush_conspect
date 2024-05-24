import java.util.ArrayList;

public class Dog extends BasicAnimal {
    public String name;
    private int yearsOld;
    private double weigthKg;
    private int maxYearsOld = 35;
    public ArrayList<Parasite> parasitesLanded;

    public Dog(String name) {
        this.name = name;
        this.yearsOld = minYearsOld;
        this.weigthKg = minKgWeight;
        this.parasitesLanded = new ArrayList<Parasite>();
    }
    public String getName() {
        return name;
    }
    public void says() {
        System.out.println("Dog " + this.name + " barks");
    }
    public void move() {
        System.out.println("Dog " + this.name + " runs strictly");
    }
}

import java.util.ArrayList;

public class Dog extends BasicAnimal {
    public String name;
    private int yearsOld;
    private double weigthKg;
    private int maxYearsOld = 35;
    public ArrayList<Parasite> parasitesLanded = new ArrayList<Parasite>();

    public Dog(String name) {
        super();
        this.name = name;
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
//    public void append_parazyte(Parasite parasite) {
//        super.append_parazyte(parasite);
//    }
//    public void shareParasites(BasicAnimal animal, boolean all, int prstsToShare) {
//        super.shareParasites(animal, all, prstsToShare);
//    }
}

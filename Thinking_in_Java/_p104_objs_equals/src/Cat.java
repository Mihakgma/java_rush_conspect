import java.util.ArrayList;

public class Cat extends BasicAnimal {
    public String name;
    private int yearsOld;
    private double weigthKg;
    private int maxYearsOld = 25;
    public ArrayList<Parasite> parasitesLanded = new ArrayList<Parasite>();
    public Cat(String name) {
        super();
        this.name = name;
    }
    public String getName() {
        return name;
    }
//    public void says() {
//        System.out.println("Cat " + this.name + " meows");
//    }
    public void move() {
        System.out.println("Cat " + this.name + " graciously walks");
    }
    public void append_parazyte(Parasite parasite) {
        super.append_parazyte(parasite);
    }
    public void shareParasites(BasicAnimal animal, boolean all, int prstsToShare) {
        super.shareParasites(animal, all, prstsToShare);
    }
}

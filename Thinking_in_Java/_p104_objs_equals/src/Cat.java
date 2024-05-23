import java.util.ArrayList;

public class Cat extends BasicAnimal {
    public String name;
    private int yearsOld;
    private double weigthKg;
    private int maxYearsOld = 25;
    public ArrayList<Parasite> parasitesLanded = new ArrayList<Parasite>();
    public Cat(String name) {
        this.name = name;
        this.yearsOld = minYearsOld;
        this.weigthKg = minKgWeight;
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
}

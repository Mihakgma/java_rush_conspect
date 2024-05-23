import java.util.ArrayList;

public class Dog implements Animal{
    String name;
    private int yearsOld;
    private double weigthKg;
    private int maxYearsOld = 35;
    public ArrayList<Parasite> parasitesLanded = new ArrayList<Parasite>();

    public Dog(String name) {
        this.name = name;
        this.yearsOld = minYearsOld;
        this.weigthKg = minKgWeight;
    }
    public void says() {
        System.out.println("Dog " + this.name + " barks");
    }
    public void move() {
        System.out.println("Dog " + this.name + " runs strictly");
    }
    public int getYearsOld() {
        return this.yearsOld;
    }

    public double getWeigthKg() {
        return weigthKg;
    }

    public void setYearsOld(int yearsOld) {
        if (yearsOld >= minYearsOld &&
            yearsOld >= this.getYearsOld() &&
            yearsOld <= maxYearsOld) {
            this.yearsOld = yearsOld;
        } else if (yearsOld > maxYearsOld) {
            this.yearsOld = maxYearsOld;
        } else {
            this.yearsOld = minYearsOld;
        }
    }

    public void setWeigthKg(double weigthKg) {
        if (weigthKg >= minKgWeight) {
            this.weigthKg = weigthKg;
        } else {
            this.weigthKg = minKgWeight;
        }
    }
    public void append_parazyte(Parasite parasite) {
        System.out.println(parasite.name + " successfully landed upon " + this.name + ":-(");
        this.parasitesLanded.add(parasite);
        this.setWeigthKg(this.getWeigthKg() + parasite.getWeigthKg());
        this.says();
    }
}

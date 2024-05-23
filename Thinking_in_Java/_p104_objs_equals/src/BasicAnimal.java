import java.util.ArrayList;

public class BasicAnimal implements Animal{
    public String name;
    private int yearsOld;
    private double weigthKg;
    private int maxYearsOld = 35;
    public ArrayList<Parasite> parasitesLanded = new ArrayList<Parasite>();

    public String getName() {
        return name;
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
        System.out.println(parasite.name + " successfully landed upon " + getName() + ":-(");
        this.parasitesLanded.add(parasite);
        this.setWeigthKg(this.getWeigthKg() + parasite.getWeigthKg());
        this.says();
    }
    public void shareParasites(BasicAnimal animal, boolean all, int prstsToShare) {
        int maxPrstsShare = this.parasitesLanded.size() - 1;
        if (all) {
            for (int i = 0; i < this.parasitesLanded.size(); i++) {
                animal.append_parazyte(this.parasitesLanded.get(i));
            }
        } else {
            if (prstsToShare > maxPrstsShare || prstsToShare < 0) {
                System.out.println("Parasites to share number has to be between 0 and " + maxPrstsShare);
                System.out.println("You have tried to share first " + prstsToShare + " parasites of " + this.name);
                System.out.println("Sharing process has been denied.");
            } else {
                for (int i = 0; i < prstsToShare; i++) {
                    animal.append_parazyte(this.parasitesLanded.get(i));
                }
            }
        }
    }
}

import java.util.ArrayList;
import java.text.DecimalFormat;


public class BasicAnimal implements Animal{
    protected String name;
    protected int yearsOld;
    protected double weigthKg;
    protected int maxYearsOld = 250; // turtle is the oldest one amongst all animals!!!
    protected boolean isAlive;
    public ArrayList<Parasite> parasitesLanded = new ArrayList<Parasite>();
    protected int legsNum;
    protected ArrayList<Leg> legsContainer = new ArrayList<>();
    protected boolean isClean;

    public BasicAnimal(Legs legs) {
//        this.name = "";
        this.yearsOld = minYearsOld;
        this.weigthKg = minKgWeight;
        this.parasitesLanded = new ArrayList<Parasite>();
        this.isAlive = true;
        this.legsNum = legs.ordinal();
        fulfillLegsContainer();
    }

    protected void fulfillLegsContainer() {
        for (int i = 0; i < legsNum; i++) {
            legsContainer.add(new Leg());
        }
    }

    public ArrayList<Leg> getLegsConainer() {
        return legsContainer;
    }
    public void printLegsNumber() {
        print(getName() + " has " + legsNum + " legs");
        print(getLegsConainer());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOld() {
        return this.yearsOld;
    }

    public double getWeigthKg() {return this.weigthKg;}

    void becameClean() {
        isClean = true;
    }

    protected void becomeDead() {
//        setWeigthKg(-999);
        this.isAlive = false;
        print(getName() + " is dead...");
        if (this instanceof Parasite) {
            BasicAnimal host = ((Parasite) this).getHost();
            // remove parasite from parasite list here through special method!!!
            ((Parasite) this).setHost(null);
        }
//        Killer.finish(this);
    }

    protected boolean checkIfDead() {
        if (this.isAlive == false) {
            print(getName() + " is dead...");
            return true;
        }
        return false;
    }

    public void eatAnimal(BasicAnimal animal) throws Throwable {
        if (animal.checkIfDead()) {
            return;
        }
        // setting new weight
        setWeigthKg(getWeigthKg() + animal.getWeigthKg());
        animal.becomeDead();
        this.says();
        print(getName() + ": mmmm, how delicious " + animal.getName() + " is!");
    }


    public void setYearsOld(int yearsOld, int maxYearsOld) {
        if (this.checkIfDead()) {
            return;
        }
        if (yearsOld >= minYearsOld &&
                yearsOld >= getYearsOld() &&
                yearsOld <= maxYearsOld) {
            this.yearsOld = yearsOld;
        } else if (yearsOld > maxYearsOld) {
            this.yearsOld = maxYearsOld;
        } else {
            this.yearsOld = minYearsOld;
        }
    }

    public void setWeigthKg(double weigthKg) {
        if (this.checkIfDead()) {
            return;
        }
        if (weigthKg >= minKgWeight) {
            this.weigthKg = weigthKg;
        } else {
            this.weigthKg = minKgWeight;
        }
    }
    public void append_parazyte(Parasite parasite) {
        if (this.checkIfDead() || parasite.checkIfDead()) {
            return;
        }
        if (parasitesLanded.contains(parasite)) {
            print(getName() + " already has " + parasite.getName());
            return;
        }
        print(parasite.getName() + " successfully landed upon " + this.getName() + ":-(");
        this.parasitesLanded.add(parasite);
        parasite.setHost(this);
        this.setWeigthKg(this.getWeigthKg() + parasite.getWeigthKg());
        this.says();
    }
    public void shareParasites(BasicAnimal animal, boolean all, int prstsToShare) {
        if (this.checkIfDead() || animal.checkIfDead()) {
            return;
        }
        int maxPrstsShare = this.parasitesLanded.size() - 1;
        if (all) {
            for (int i = 0; i < this.parasitesLanded.size(); i++) {
                animal.append_parazyte(this.parasitesLanded.get(i));
            }
        } else {
            if (prstsToShare > maxPrstsShare || prstsToShare < 0) {
                print("Parasites to share number has to be between 0 and " + maxPrstsShare);
                print("You have tried to share first " + prstsToShare + " parasites of " + this.name);
                print("Sharing process has been stopped.");
            } else {
                for (int i = 0; i < prstsToShare; i++) {
                    animal.append_parazyte(this.parasitesLanded.get(i));
                }
            }
        }
    }


    public int getLegsNum() {
        return legsNum;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.#####");
        return
                "Name: " + getName() + "\n" +
                "Years old: " + getYearsOld() + "\n" +
                "Weight: " + df.format(getWeigthKg()) + "\n" +
                "Is alive: " + isAlive + "\n" +
                "Legs number: " + getLegsNum() + "\n" +
                "Parazites number: " + parasitesLanded.size() + "\n" +
                "Is clean: " + isClean;
    }

    static void print(Object obj) {
        System.out.println(obj);
    }
}

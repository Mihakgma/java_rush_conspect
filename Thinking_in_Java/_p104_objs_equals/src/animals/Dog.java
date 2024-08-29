package animals;
public class Dog extends Mammal {
    protected String name;
    private final int maxYearsOld = 30;

    public Dog(String name) {
        super(name, Legs.Quadruped);
    }
    public void says() {
        System.out.println("Dog " + getName() + " barks");
    }
    public void move() {
        System.out.println("Dog " + getName() + " runs strictly");
    }
    public void setYearsOld(int yearsOld) {
        super.setYearsOld(yearsOld, this.maxYearsOld);
    }
}

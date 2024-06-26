
public class Cat extends Mammal {
    protected String name;
    private int maxYearsOld = 40;
    public Cat(String name) {
        super(name, Legs.Quadruped);
    }
    public void says() {
        System.out.println("Cat " + getName() + " meows");
    }
    public void move() {
        System.out.println("Cat " + getName() + " graciously walks");
    }
    public void setYearsOld(int yearsOld) {
        super.setYearsOld(yearsOld, this.maxYearsOld);
    }
}

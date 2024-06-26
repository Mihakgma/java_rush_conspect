public class Human extends Mammal {
    protected String name;
    private int maxYearsOld = 150;
    public Human(String name) {
        super(name, Legs.Bipedal);
    }
    public void says() {
        System.out.println("Hi, my name is " + getName() +
                ".\nI am " + getYearsOld() + " years old.");
    }
    public void move() {
        System.out.println(getName() + " walks");
    }
    public void setYearsOld(int yearsOld) {
        super.setYearsOld(yearsOld, this.maxYearsOld);
    }
}

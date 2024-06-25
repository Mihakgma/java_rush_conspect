
public class Cat extends Mammal {
    protected String name;
    private int maxYearsOld = 40;
    public Cat(String name) {
        super(name, Legs.Quadruped);
    }
//    public String getName() {
//        return name;
//    }
//    public void says() {
//        System.out.println("Cat " + this.name + " meows");
//    }
    public void move() {
        System.out.println("Cat " + this.name + " graciously walks");
    }
    public void setYearsOld(int yearsOld) {
        super.setYearsOld(yearsOld, this.maxYearsOld);
    }
}

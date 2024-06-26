public class Bird extends BasicAnimal{
    public String name;
    private int maxYearsOld = 75; // probably crows

    public Bird(String name) {
        super(Legs.Bipedal);
        super.setName(name);
    }
    public String getName() {
        return name;
    }
    public void says() {
        if (checkIfDead()) {
            return;
        }
        System.out.println("Bird " + this.name + " tweets a lovely tune");
    }
    public void move() {
        if (checkIfDead()) {
            return;
        }
        System.out.println("Bird " + this.name + " opened its wings and flown away...");
    }
    public void setYearsOld(int yearsOld) {
        super.setYearsOld(yearsOld, this.maxYearsOld);
    }
}

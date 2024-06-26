public class Bird extends BasicAnimal{
    public String name;
    private int maxYearsOld = 75; // probably crows

    public Bird(String name) {
        super(Legs.Bipedal);
        super.setName(name);
    }
    public void says() {
        if (checkIfDead()) {
            return;
        }
        System.out.println("Bird " + getName() + " tweets a lovely tune");
    }
    public void move() {
        if (checkIfDead()) {
            return;
        }
        System.out.println("Bird " + getName() + " opened its wings and flown away...");
    }
    public void setYearsOld(int yearsOld) {
        super.setYearsOld(yearsOld, this.maxYearsOld);
    }
}

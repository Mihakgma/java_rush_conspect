import java.util.ArrayList;

public class Dog extends BasicAnimal {
    public String name;
    private int maxYearsOld = 27;

    public Dog(String name) {
        super();
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void says() {
        System.out.println("Dog " + this.name + " barks");
    }
    public void move() {
        System.out.println("Dog " + this.name + " runs strictly");
    }
    public void setYearsOld(int yearsOld) {
        super.setYearsOld(yearsOld, this.maxYearsOld);
    }
}

import java.util.ArrayList;

public class Cat extends BasicAnimal {
    public String name;
    private int maxYearsOld = 40;
    public Cat(String name) {
        super();
        this.name = name;
    }
    public String getName() {
        return name;
    }
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

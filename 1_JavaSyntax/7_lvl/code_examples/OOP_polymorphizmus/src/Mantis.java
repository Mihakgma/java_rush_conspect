public class Mantis extends Insect {
    public boolean male;
    Mantis(int legs, int wings, boolean male) {
        super(legs, wings);
        this.male = male;
    }
    Mantis() {
        super(6, 6);
        this.male = false;
        System.out.println("Ideal mantis creation has been initiated.");
    }

    public void attack() {
        System.out.println("Mantis attacks its victim!");
    }
}

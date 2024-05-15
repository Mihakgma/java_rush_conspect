public class Insect {
    public int legs;
    public int wings;

    public Insect(int legs, int wings) {
        this.legs = legs;
        this.wings = wings;
    }

    public void move() {
        System.out.println("Insect runs");
    }

    public void fly() {
        System.out.println("Insect flies");
    }

    public void feed() {
        System.out.println("Insect feeds...");
    }
}

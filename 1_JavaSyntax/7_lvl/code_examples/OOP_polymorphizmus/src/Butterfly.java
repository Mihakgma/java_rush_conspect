
public class Butterfly extends Insect {
    public String color;
    Butterfly(int legs, int wings, String color) {
        super(legs, wings);
        this.color = color;
    }
    public void feed() {
        System.out.println("Butterfly feeds.");
    }
}

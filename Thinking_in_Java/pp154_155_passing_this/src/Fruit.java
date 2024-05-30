public class Fruit {
    protected boolean eaten;
    protected double weight;
    protected String color;
    public Fruit(double weight, String color) {
        this.eaten = false;
        this.weight = weight;
        this.color = color;
    }
    Fruit getPeeled() {return Peeler.peel(this); }
    void getEaten() {
        this.eaten = true;
        System.out.println(this.getClass().getName() + " has been eaten");
    }
    @Override
    public String toString() {
        String beenEaten;
        if (this.eaten) {
            beenEaten = " <has been eaten>";
        } else beenEaten = " <has not been eaten>";
        return "<" + this.getClass().getName() +
                "> with weight <" + this.weight + "> kilos &\n" +
                "with <" + this.color + "> color" + beenEaten;
    }
}

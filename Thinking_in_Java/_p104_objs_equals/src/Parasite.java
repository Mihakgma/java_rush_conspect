public class Parasite implements Animal{
    String name;
    private double weigthKg;
    public Parasite(String name) {
        this.name = name;
        this.weigthKg = minKgWeight;
    }
    public void move() {
        System.out.println("Parasite " + this.name + " ambushes quickly");
    }

    public double getWeigthKg() {
        return weigthKg;
    }
    public void setWeigthKg(double weigthKg) {
        if (weigthKg >= minKgWeight) {
            this.weigthKg = weigthKg;
        } else {
            this.weigthKg = minKgWeight;
        }
    }

}

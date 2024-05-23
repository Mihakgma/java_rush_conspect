public class Cat implements Animal{
    String name;
    private int yearsOld;
    private double weigthKg;
    private int maxYearsOld = 25;
    public Cat(String name) {
        this.name = name;
        this.yearsOld = minYearsOld;
        this.weigthKg = minKgWeight;
    }
//    public void says() {
//        System.out.println("Cat " + this.name + " meows");
//    }
    public void move() {
        System.out.println("Cat " + this.name + " graciously walks");
    }
    public int getYearsOld() {
        return this.yearsOld;
    }

    public double getWeigthKg() {
        return weigthKg;
    }

    public void setYearsOld(int yearsOld) {
        if (yearsOld >= minYearsOld &&
                yearsOld >= this.getYearsOld() &&
                yearsOld <= maxYearsOld) {
            this.yearsOld = yearsOld;
        } else if (yearsOld > maxYearsOld) {
            this.yearsOld = maxYearsOld;
        } else {
            this.yearsOld = minYearsOld;
        }
    }

    public void setWeigthKg(double weigthKg) {
        if (weigthKg >= minKgWeight) {
            this.weigthKg = weigthKg;
        } else {
            this.weigthKg = minKgWeight;
        }
    }
}

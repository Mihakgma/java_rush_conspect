public class Spider extends Arthropod {
    protected String name;
    // https://nplus1.ru/news/2018/04/27/oldest-spider
    static final int maxYearsOld = 45;

    public Spider(String name) {
        super(name, Legs.Spiders);
    }
    public void says() {
        System.out.println("Spider " + getName() + " cannot speak");
    }
    public void move() {
        System.out.println("Spider " + getName() + " climbs upon a web");
    }
    public void setYearsOld(int yearsOld) {
        super.setYearsOld(yearsOld, this.maxYearsOld);
    }
    public void createCobWeb(){
        System.out.println(getName() + " created a net!!!");
    }
}

public class Parasite extends BasicAnimal{
    protected String name;
    protected BasicAnimal host;
    public Legs legs;
    public Parasite(String name, Legs legs) {
        super(legs);
        super.setName(name);
    }

    public void setHost(BasicAnimal host) {
        this.host = host;
    }

    public BasicAnimal getHost() {
        return host;
    }

    public void move() {
        System.out.println("Parasite " + getName() + " ambushes quickly");
    }

    @Override
    public void swim() {
        print(this.getName() + " cannot swim... :-(((");
    }

    @Override
    public String toString() {
        String s = super.toString();
        if (getHost() != null) {
            s += "\nHost name: " + getHost().getName();
        }
        return s;
    }
}

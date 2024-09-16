public class Switch {
    private boolean state = false;
    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        Main.print(this);
    }

    public void off() {
        state = false;
        Main.print(this);
    }

    @Override
    public String toString() {
        String s = "Switch state = ";
        s += state ? "on" : "off";
        return s;
    }
}

public class Shape {
    public void draw() {}
    public void erase() {}
    public void fill(String color) {
        Main.print(this.getClass() + " is filled with " + color + " color");
    }
}

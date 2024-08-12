public class Circle extends Shape{
    @Override
    public void draw() {
        Main.print("Circle.draw()");
    }

    @Override
    public void erase() {
        Main.print("Circle.erase()");
    }

    @Override
    public void fill(String color) {
        Main.print("Circle has no fill");
    }
}

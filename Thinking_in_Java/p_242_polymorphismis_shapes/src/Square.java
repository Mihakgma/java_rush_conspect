public class Square extends Shape{
    @Override
    public void draw() {
        Main.print("Square.draw()");
    }

    @Override
    public void erase() {
        Main.print("Square.erase()");
    }
}

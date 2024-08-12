import java.util.Random;

/*
* This class generates randomly shapes (Circle, Square, Triangle)
* which are extensions of the parent class Shape
* The mechanism of current class is upp transfer of classes to parent (Shape)
* while randomizing process
* */
public class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}

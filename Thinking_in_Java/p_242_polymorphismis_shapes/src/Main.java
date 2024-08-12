public class Main {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for(Shape shp: s) {
            // execute methods of classes not parent's
            shp.draw();
            // only one class uses its own method, others take it from parent's "scope"
            shp.fill("blue");
        }
    }
    public static void print(Object obj) {
        System.out.println(obj);
    }
}

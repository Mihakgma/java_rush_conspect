public class Tree {
    int height;
    Tree() {
        print("Plant an offspring");
        height = 0;
    }
    Tree(int initialHeight) {
        height = initialHeight;
        print("Creating new tree with height " + initialHeight + " meters");
    }
    void info() {
        print("A tree with height " + height + " meters");
    }
    void info(String s) {
        print(s + ": A tree with height " + height + " meters");
    }
    static void print(Object obj) {
        System.out.println(obj);
    }
}

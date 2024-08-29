public class ToyTest {
    static void printClassInfo (Class cc) {
        Main.print("Class name: " + cc.getName());
        Main.print("Is interface? [" + cc.isInterface() + "]");
        Main.print("Simple name: " + cc.getSimpleName());
        Main.print("Canonical name: " + cc.getCanonicalName());
    }
}

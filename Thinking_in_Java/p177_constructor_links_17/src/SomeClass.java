public class SomeClass {
    private static int id = 0;
    public SomeClass(String s) {
        System.out.println(s);
        id++;
        this.id = getId();
    }
    public String toString() {
        return new String("Object with id = " + this.id);
    }
    int getId() {
//        SomeClass.id++;
        return id;
    }
}

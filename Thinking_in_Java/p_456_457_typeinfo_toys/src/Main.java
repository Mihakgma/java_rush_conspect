public class Main {
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("FancyToy");
        } catch (ClassNotFoundException e) {
            print("Cannot find FancyToy");
            System.exit(1);
        }
        ToyTest.printClassInfo(c);
        for (Class face: c.getInterfaces())
            ToyTest.printClassInfo(face);
        Class up = c.getSuperclass();
        Object object = null;
        try {
            // need to have default PARENT class constructor
            // i.e. uncommented constructor.
            object = up.newInstance();
        } catch (InstantiationException e) {
            print("Cannot create class unit");
            System.exit(1);
        } catch (IllegalAccessException e) {
            print("Access denied");
            System.exit(1);
        }
        ToyTest.printClassInfo(object.getClass());
    }
    public static void print(Object obj) {
        System.out.println(obj);
    }
}

/**
 * Program's classes and other fragments load in memory in the case of neccesity
 * while creating a new object or through Class methods calling.
 * Look at the example below how class loader works...
 */
public class Main {
    public static String[] classNames = {
            "Gum",
            "Duffodil",
            "Crocs",
            "Candy",
            "SweatShot"
    };
    public static void main(String[] args) {
        SweetShop.fillShop(classNames);
    }
    static void print(Object object) {

        System.out.println(object);
    }
}

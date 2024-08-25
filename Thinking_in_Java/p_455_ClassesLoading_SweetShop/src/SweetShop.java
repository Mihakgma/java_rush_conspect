public class SweetShop {
    static void fillShop(String[] classesNames) {
        Main.print("Beginning...");
        new Candy();
        Main.print("After Candy creating");
        new Cookie();
        Main.print("After Cookie creating");
        for (String className : classesNames) {
            try {
                Class.forName(className);
                Main.print("After creating method Class.forName(\"" + className + "\")");
            } catch (ClassNotFoundException e) {
                Main.print(className + " class not found");
            }
        }
    }
}

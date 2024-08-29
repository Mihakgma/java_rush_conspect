package animals;
public class Arthropod extends BasicAnimal{
    public Arthropod(String name, Legs legs) {
        super(legs);
        super.setName(name);
    }
    public static void becomeImago(Arthropod arthropod) {
        System.out.println("Class name for current object is: ");
        System.out.println(arthropod.getClass());
        System.out.println(arthropod.getName() + " became imago...");
    }
}

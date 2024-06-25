public class Mammal extends BasicAnimal {
    public Mammal(String name) {
        super(Legs.Quadruped);
        this.name = name;
    }
    public Mammal (String name, int legs) {
        super(Mammal.checkLegsNumber(legs));
        this.name = name;
    }
    public Mammal(String name, Legs legs) {
        super(legs);
        this.name = name;
    }

    protected static Legs checkLegsNumber(int legsNumber) throws ArrayIndexOutOfBoundsException{
        try {
            Legs myEnum = Legs.values()[legsNumber];
            System.out.println("Название константы (количество ног): " + myEnum.name());
            return myEnum;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Константа с таким индексом не найдена.");
        }
        return null;
    }
}

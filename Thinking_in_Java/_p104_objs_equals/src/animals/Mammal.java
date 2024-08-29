package animals;
public class Mammal extends BasicAnimal {
    public Mammal() {
        super(Legs.Quadruped);
        super.setName(nickName);
    }
    public Mammal(String name) {
        super(Legs.Quadruped);
        super.setName(name);
    }
    public Mammal (String name, int legs, double swimSpeed) {
        super(Mammal.checkLegsNumber(legs));
        super.setName(name);
        super.setSwimSpeed(swimSpeed);
    }
    public Mammal(String name, Legs legs) {
        super(legs);
        super.setName(name);
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

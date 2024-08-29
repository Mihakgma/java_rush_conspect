package animals;
public enum Legs {
    Nolegs,
    Gastropodae,
    Bipedal,
    Legs3,
    Quadruped,
    Legs5,
    Insects,
    Legs7,
    Spiders;

    public static Legs[] getAnimalsNA() {
        return new Legs[]{Legs3, Legs5, Legs7};
    }
    public static Legs[] getMammals() {
        return new Legs[]{Bipedal, Quadruped};
    }
    public static Legs[] getArthropods() {return new Legs[]{Insects, Spiders};}
}

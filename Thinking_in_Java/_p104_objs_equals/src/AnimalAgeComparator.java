import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<BasicAnimal>{
    @Override
    public int compare(BasicAnimal animal1, BasicAnimal animal2) {
        return animal2.getYearsOld() - animal1.getYearsOld();
    }
}

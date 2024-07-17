import java.util.Comparator;
public class LegsNumberComparator implements Comparator<BasicAnimal> {
    @Override
    public int compare(BasicAnimal animal1, BasicAnimal animal2) {
        return animal2.getLegsNumber() - animal1.getLegsNumber();
    }
}

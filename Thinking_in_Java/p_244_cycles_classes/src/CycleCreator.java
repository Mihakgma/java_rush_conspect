import java.util.Random;

public class CycleCreator {
    final long SEED = 12L;
    protected int iterations;
    private Random rand = new Random(SEED);
    public CycleCreator(){
        this.iterations = 4;
    }
    public CycleCreator(int iterations){
        this.iterations = iterations;
    }
    public Cycle next(boolean needRandom) {
        switch (rand.nextInt(getIterations())){
            default:
            case 1: return new Unicycle();
            case 2: return new Bicycle();
            case 3: return new Tricycle();
        }
        }
    public Cycle next() {
        for (int i = 1; i < getIterations(); i++) {
        switch (i){
            default:
            case 1: return new Unicycle();
            case 2: return new Bicycle();
            case 3: return new Tricycle();
        }
        }
    }
    public int getIterations() {
        return this.iterations;
    }
}

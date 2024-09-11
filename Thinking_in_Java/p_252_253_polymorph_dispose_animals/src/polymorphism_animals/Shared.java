package polymorphism_animals;

/**
 * This class is used to count number of objects created
 * and also refs of objects in witch it has been composed
 */
public abstract class Shared {
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public void addRef() {
        refCount++;
    }
    public void delRef() {
        refCount--;
    }

    public int getRefCount() {
        return refCount;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " obj with id = " +
                getId() +
                " , with value = <";
    }
    abstract void dispose();
}

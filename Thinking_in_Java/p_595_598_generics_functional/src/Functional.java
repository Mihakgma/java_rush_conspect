import java.util.Iterator;

/**
 Applying objects of Combiner class for each element
 for summarize it with total result
 the last one returns
 */
public class Functional {
    public static <T> T
    reduce (Iterable<T> seq, Combiner<T> combiner) {
        Iterator<T> it = seq.iterator();
        if (it.hasNext()){
            T result = it.next();
            while (it.hasNext())
                result = combiner.combine(result, it.next());
            return result;
        }
        // If seq - empty list
        return null;
    }
    // gets funct object and apply it for each object
    // in list ignoring returning object
    // function object can act as parameter-aggregator, so it returns in the end
    public static <T> Collector<T>
    forEach (Iterable<T> seq, Collector<T> func) {
        for (T t : seq)
            func.function(t);
        return func;
    }
    // creates list of results processing func object for each obj in list
}

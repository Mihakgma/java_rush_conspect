public interface Collector<T> extends UnaryFunction<T,T>{
    T result(); // output from parameter aggregator
}

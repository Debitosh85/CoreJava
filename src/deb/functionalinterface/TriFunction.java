package deb.functionalinterface;
@FunctionalInterface
public interface TriFunction<T, U, V, R> {
  R myApply(T a, U b, V c);
}

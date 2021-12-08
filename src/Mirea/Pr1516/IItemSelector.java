package Pr1516;

@FunctionalInterface
public interface IItemSelector<E> {
    boolean selectIt(E item);
}
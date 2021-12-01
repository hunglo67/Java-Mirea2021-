package Mirea.pr10b.Complex;

public class Test {
    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        Complex firstComplex = factory.createComplex();
        Complex secondComplex = factory.createComplex(4, 2);
        Complex threeComplex = factory.createComplex(6, 7);
        System.out.println(firstComplex.sub(secondComplex));
        System.out.println(firstComplex.add(threeComplex));
    }
}
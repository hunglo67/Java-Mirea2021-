package Mirea.pr10b.Complex;

public class ConcreteFactory implements ComplexAbstractFactory{

    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex createComplex(double real, double image) {
        return new Complex(real, image);
    }
}
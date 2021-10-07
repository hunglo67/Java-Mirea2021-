package Mirea.lap5.task1.figures;

import Mirea.lap5.task1.Shape;

import java.awt.*;
import java.util.Random;

public class Rectangle extends Shape {

    @Override
    protected int FirstParameters() {
        return 10 + (int) (Math.random() * 50);
    }

    @Override
    protected int SecondParameters() {
        return 10 + (int) (Math.random() * 50); }

    @Override
    protected Color setColor() {
        return getColor(); }
}
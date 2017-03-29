package com.codingtest.examples.shapes;

import com.sun.istack.internal.NotNull;

/**
 * Created by ckremer on 3/29/2017.
 */
public class triangle implements shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public triangle(@NotNull final double a, @NotNull final double b, @NotNull final double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(@NotNull final double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(@NotNull final double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(@NotNull final double sideC) {
        this.sideC = sideC;
    }

    /**
     * Area calculation for Triangle.
     *
     * @return double area value
     */
    public double getArea() {
        return (sideA + sideB + sideC) / 2.0;
    }

    /**
     * Perimeter calculation for Triangle.
     *
     * @return double perimeter value
     */
    public double getPerimeter() {
        return (sideA + sideB + sideC);

    }
}

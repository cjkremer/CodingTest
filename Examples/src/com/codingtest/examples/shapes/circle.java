package com.codingtest.examples.shapes;

import com.sun.istack.internal.NotNull;

/**
 * Created by ckremer on 3/29/2017.
 */
public class circle implements shape {

    private double radius;

    public circle(@NotNull final double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(@NotNull final double radius) {
        this.radius = radius;
    }

    /**
     * Area calculation for Circle.
     *
     * @return double area value
     */
    public double getArea() {
        return (Math.PI * radius * radius);
    }

    /**
     * Perimeter calculation for Circle.
     *
     * @return double perimeter value
     */
    public double getPerimeter() {
        return (2.0 * Math.PI * radius);
    }
}

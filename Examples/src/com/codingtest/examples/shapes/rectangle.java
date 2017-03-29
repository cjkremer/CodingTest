package com.codingtest.examples.shapes;

import com.sun.istack.internal.NotNull;

/**
 * Created by ckremer on 3/29/2017.
 */
public class rectangle implements shape {

    private double height;
    private double width;

    public rectangle(@NotNull final double height, @NotNull final double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(@NotNull final double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(@NotNull final double width) {
        this.width = width;
    }

    /**
     * Area calculation for Rectangle.
     *
     * @return double area value
     */
    public double getArea() {
        return (width * height);
    }

    /**
     * Perimeter calculation for Rectangle.
     *
     * @return double perimeter value
     */
    public double getPerimeter() {
        return (2.0 * height) + (2.0 * width);
    }
}

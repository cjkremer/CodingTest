package com.codingtest.examples.shapes;

import junit.framework.Assert;
import junit.framework.TestCase;


/**
 * Created by ckremer on 3/29/2017.
 */
public class circleTest extends TestCase {
    @org.junit.Test
    public void getRadius() throws Exception {
        final circle test = new circle(3.3);
        Assert.assertEquals("Radius did not match!", 3.3, test.getRadius());
    }

    @org.junit.Test
    public void setRadius() throws Exception {
        final circle test = new circle(3.3);
        test.setRadius(5.5);
        Assert.assertEquals("Radius did not match!", 5.5, test.getRadius());
    }

    @org.junit.Test
    public void getArea() throws Exception {
        final circle test = new circle(3.3);
        final double area = Math.PI * 3.3 * 3.3;
        Assert.assertEquals("Circle Area did not match!", area, test.getArea());
    }

    @org.junit.Test
    public void getPerimeter() throws Exception {
        final circle test = new circle(3.3);
        final double perimeter = 2.0 *Math.PI * 3.3;
        Assert.assertEquals("Circle Perimeter did not match!", perimeter, test.getPerimeter());
    }

}
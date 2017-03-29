package com.codingtest.examples.shapes;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by ckremer on 3/29/2017.
 */
public class triangleTest extends TestCase {
    public void testGetSideA() throws Exception {
        final triangle test = new triangle(1.1, 2.2, 3.3);
        Assert.assertEquals("Side A did not match!", 1.1, test.getSideA());
    }

    public void testSetSideA() throws Exception {
        final triangle test = new triangle(1.1, 2.2, 3.3);
        test.setSideA(4.4);
        Assert.assertEquals("Side A did not match!", 4.4, test.getSideA());
    }

    public void testGetSideB() throws Exception {
        final triangle test = new triangle(1.1, 2.2, 3.3);
        Assert.assertEquals("Side B did not match!", 2.2, test.getSideB());
    }

    public void testSetSideB() throws Exception {
        final triangle test = new triangle(1.1, 2.2, 3.3);
        test.setSideB(4.4);
        Assert.assertEquals("Side B did not match!", 4.4, test.getSideB());
    }

    public void testGetSideC() throws Exception {
        final triangle test = new triangle(1.1, 2.2, 3.3);
        Assert.assertEquals("Side C did not match!", 3.3, test.getSideC());
    }

    public void testSetSideC() throws Exception {
        final triangle test = new triangle(1.1, 2.2, 3.3);
        test.setSideC(4.4);
        Assert.assertEquals("Side C did not match!", 4.4, test.getSideC());
    }

    public void testGetArea() throws Exception {
        final triangle test = new triangle(1.5, 2.6, 3.7);
        final double area = (1.5 + 2.6 + 3.7) / 2.0;
        Assert.assertEquals("Area did not match!", area, test.getArea());
    }

    public void testGetPerimeter() throws Exception {
        final triangle test = new triangle(1.5, 2.6, 3.7);
        final double perimeter = (1.5 + 2.6 + 3.7);
        Assert.assertEquals("Perimeter did not match!", perimeter, test.getPerimeter());
    }

}
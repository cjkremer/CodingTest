package com.codingtest.examples.shapes;

import junit.framework.Assert;
import junit.framework.TestCase;


/**
 * Created by ckremer on 3/29/2017.
 */
public class triangleTest extends TestCase {
    @org.junit.Test
    public void testGetSideA() throws Exception {
        final triangle test = new triangle(1.1, 2.2, 3.3);
        Assert.assertEquals("Side A did not match!", 1.1, test.getSideA());
    }

    @org.junit.Test
    public void testSetSideA() throws Exception {
        final triangle test = new triangle(1.1, 2.2, 3.3);
        test.setSideA(4.4);
        Assert.assertEquals("Side A did not match!", 4.4, test.getSideA());
    }

    @org.junit.Test
    public void testGetSideB() throws Exception {
        final triangle test = new triangle(1.1, 2.2, 3.3);
        Assert.assertEquals("Side B did not match!", 2.2, test.getSideB());
    }

    @org.junit.Test
    public void testSetSideB() throws Exception {
        final triangle test = new triangle(1.1, 2.2, 3.3);
        test.setSideB(4.4);
        Assert.assertEquals("Side B did not match!", 4.4, test.getSideB());
    }

    @org.junit.Test
    public void testGetSideC() throws Exception {
        final triangle test = new triangle(1.1, 2.2, 3.3);
        Assert.assertEquals("Side C did not match!", 3.3, test.getSideC());
    }

    @org.junit.Test
    public void testSetSideC() throws Exception {
        final triangle test = new triangle(1.1, 2.2, 3.3);
        test.setSideC(4.4);
        Assert.assertEquals("Side C did not match!", 4.4, test.getSideC());
    }

    @org.junit.Test
    public void testGetArea() throws Exception {
        final triangle test = new triangle(1.5, 2.6, 3.7);
        final double area = (1.5 + 2.6 + 3.7) / 2.0;
        Assert.assertEquals("Triangle Area did not match!", area, test.getArea());
    }

    @org.junit.Test
    public void testGetPerimeter() throws Exception {
        final triangle test = new triangle(1.5, 2.6, 3.7);
        final double perimeter = (1.5 + 2.6 + 3.7);
        Assert.assertEquals("Triangle Perimeter did not match!", perimeter, test.getPerimeter());
    }

}
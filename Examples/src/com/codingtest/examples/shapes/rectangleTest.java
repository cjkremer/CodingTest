package com.codingtest.examples.shapes;

import org.junit.Test;
import junit.framework.Assert;
import junit.framework.TestCase;

import static org.junit.Assert.*;

/**
 * Created by ckremer on 3/29/2017.
 */
public class rectangleTest extends TestCase {
    @Test
    public void getHeight() throws Exception {
        final rectangle test = new rectangle(1.5, 3.5);
        Assert.assertEquals("Height did not match!", 1.5, test.getHeight());
    }

    @Test
    public void setHeight() throws Exception {
        final rectangle test = new rectangle(1.5, 3.5);
        test.setHeight(2.5);
        Assert.assertEquals("Height did not match!", 2.5, test.getHeight());
    }

    @Test
    public void getWidth() throws Exception {
        final rectangle test = new rectangle(1.5, 3.5);
        Assert.assertEquals("Width did not match!", 3.5, test.getWidth());
    }

    @Test
    public void setWidth() throws Exception {
        final rectangle test = new rectangle(1.5, 3.5);
        test.setWidth(5.5);
        Assert.assertEquals("Width did not match!", 5.5, test.getWidth());
    }

    @Test
    public void getArea() throws Exception {
        final rectangle test = new rectangle(1.5, 3.5);
        final double area = (1.5 * 3.5);
        Assert.assertEquals("Rectangle Area does not match!", area, test.getArea());
    }

    @Test
    public void getPerimeter() throws Exception {
        final rectangle test = new rectangle(1.5, 3.5);
        final double perimeter = (2.0 *1.5) + (2.0 * 3.5);
        Assert.assertEquals("Rectangle Perimeter does not match!", perimeter, test.getPerimeter());
    }

}
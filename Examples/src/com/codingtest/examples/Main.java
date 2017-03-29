package com.codingtest.examples;

import com.codingtest.examples.collections.manipulation;
import com.codingtest.examples.dots.pyramid;

public class Main {

    public static void main(String[] args) {
	manipulation man = new manipulation();
	man.doManipulation();

	pyramid dot = new pyramid();
	dot.makePyramid(5);
	dot.makePyramid(8);
    }
}

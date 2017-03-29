package com.codingtest.examples.dots;

import com.google.common.base.Strings;

/**
 * Created by ckremer on 3/29/2017.
 */
public class pyramid {

    public void makePyramid(final int max) {
        // Keep to single digits that make a pyramid
        if ((max < 2) || (max > 9)) {
            System.out.println("Enter number between 2 and 9...");
            return;
        }

        for(int idx = 1; idx < (max+1); idx++) {
            System.out.println(Strings.repeat(".", max - idx) + Strings.repeat(Integer.toString(idx), idx));
        }
    }
}

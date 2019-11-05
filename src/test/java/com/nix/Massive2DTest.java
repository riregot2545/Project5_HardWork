package com.nix;

import org.junit.Test;

import static org.junit.Assert.*;

public class Massive2DTest {

    Massive2D mass2D = new Massive2D();
    @Test
    public void buildSquare() {
        int size = 4;
        int[][] expected ={ {1,1,1,1},
                            {1,0,0,1},
                            {1,0,0,1},
                            {1,1,1,1}} ;
        int[][] actual = mass2D.buildSquare(4);
        for (int i = 0; i < size; i++) {
            assertArrayEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void buildAngle() {
        int size = 4;
        int[][] expected ={ {4,0,0,0},
                            {3,4,0,0},
                            {2,3,4,0},
                            {1,2,3,4}} ;
        int[][] actual = mass2D.buildAngle(4);
        for (int i = 0; i < size; i++) {
            assertArrayEquals(expected[i],actual[i]);
        }
    }
}
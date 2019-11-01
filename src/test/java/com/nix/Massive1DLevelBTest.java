package com.nix;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Massive1DLevelBTest {

    Massive1DLevelB mcLevelB = new Massive1DLevelB();
    @Test
    public void moveOneAndZero() {
        int[] massive = {1,1,1,0,0,0};
        mcLevelB.moveOneAndZero(massive);
        Assert.assertArrayEquals(new int[]{0,0,0,1,1,1},massive);
    }

    @Test
    public void replaceAbsGreaterMax() {
        int[] massive = {-8, 5, 2, -7, 3, 6, 4};
        mcLevelB.replaceAbsGreaterMax(massive);
        Assert.assertArrayEquals(new int[]{0,5,2,0,3,6,4},massive);
    }
}
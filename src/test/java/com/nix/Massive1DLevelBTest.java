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

    @Test
    public void getMaxElement() {
    }

    @Test
    public void getMinElement() {
    }

    @Test
    public void insertIntoSequence() {
        int[] massive = {-8, 4, 5, 6};
        Assert.assertArrayEquals(new int[]{-8,1,4,5,6},mcLevelB.insertIntoSequence(massive,1));
    }

    @Test
    public void getCommonNum() {
        int[] massive = {-8, 4, 5, 6,5,6,3,2,7,6,9,4,1,7,4};
        Assert.assertEquals(4,mcLevelB.getCommonNum(massive));
    }
}
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

    @Test
    public void findSumPairs() {
        int[] massive = {-8, 4, 5, 6};
        int[][] sumResult = mcLevelB.findSumPairs(massive,-2);
        int[][] expectedResult = {{-8,6}};
        for (int i = 0; i < expectedResult.length; i++) {
            Assert.assertArrayEquals(expectedResult[i],sumResult[i]);
        }

    }

    @Test
    public void findNumsWithEndK() {
        int[] massive = {-84, 46, 57, 63,55,66,37,22,74,62,99,42,19,72,42};
        int[] expectedMassive = {22,62,42,72,42};
        Assert.assertArrayEquals(expectedMassive,mcLevelB.findNumsWithEndK(massive,2));
    }

    @Test
    public void getAgeGroups() {
        int[] massive = {84, 46, 57, 63,55,66,37,22,74,62,99,42,19,72,42};
        int[] actual =  mcLevelB.getAgeGroups(massive);
        for (int i = 0; i < actual.length; i++) {
            System.out.println("Людей в категории от "+(i*10)+" до "+(i*10+10)+":"+actual[i]);
        }
    }
}
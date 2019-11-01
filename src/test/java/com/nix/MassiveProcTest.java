package com.nix;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MassiveProcTest {

    MassiveProc mcProc = new MassiveProc();
    @Test
    public void getFirstSign() {
        int[] negativeFirst = new int[]{-3, 3, 4};
        int[] positiveFirst = new int[]{3, 3, 4};
        int[] zeroFirst = new int[]{0, 3, 4};
        Assert.assertEquals(-1,mcProc.getFirstSign(negativeFirst));
        Assert.assertEquals(1,mcProc.getFirstSign(positiveFirst));
        Assert.assertEquals(0,mcProc.getFirstSign(zeroFirst));
    }

    @Test
    public void replaceByZ() {
        int[] massive = new int[]{3,6,2,13,5,23,6,1};
        int Z = 5;
        Assert.assertEquals(4,mcProc.replaceByZ(massive,Z));
    }

    @Test
    public void replaceMaxAndMin() {
        double[] mass = {3f,6f,2f,7f,8f,23f,5f};
        double[] replacedMass = {3f,6f,23f,7f,8f,2f,5f};
        mcProc.replaceMaxAndMin(mass);

        Assert.assertArrayEquals(replacedMass,mass,0f);
    }

    @Test
    public void replaceOddAndEven() {
        int[] massiveEven = {3,6,2,13,5,23,6,1};
        int[] massiveOdd = {3,6,2,13,5,23,6};

        mcProc.replaceOddAndEven(massiveEven);
        mcProc.replaceOddAndEven(massiveOdd);

        Assert.assertArrayEquals(new int[]{6,3,13,2,23,5,1,6},massiveEven);
        Assert.assertArrayEquals(new int[]{6,3,13,2,23,5,6},massiveOdd);
    }

    @Test
    public void printBeforeZero() {
        int[] massiveOdd = {3,6,2,13,0,23,6};
        mcProc.printBeforeZero(massiveOdd);
    }
}
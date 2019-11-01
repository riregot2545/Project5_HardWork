package com.nix;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MassiveProcTest {

    MassiveProc mcProc = new MassiveProc();
    @Test
    public void getFirstSign() {
        Assert.assertEquals(-1,mcProc.getFirstSign(new int[]{-3, 3, 4}));
        Assert.assertEquals(1,mcProc.getFirstSign(new int[]{3, 3, 4}));
        Assert.assertEquals(0,mcProc.getFirstSign(new int[]{0, 3, 4}));
    }

    @Test
    public void replaceByZ() {
        Assert.assertEquals(4,mcProc.replaceByZ(new int[]{3,6,2,13,5,23,6,1},5));
    }

    @Test
    public void replaceMaxAndMin() {
        double[] mass = {3f,6f,2f,7f,8f,23f,5f};
        double[] replacedMass = {3f,6f,23f,7f,8f,2f,5f};
        mcProc.replaceMaxAndMin(mass);

        Assert.assertArrayEquals(replacedMass,mass,0f);
    }
}
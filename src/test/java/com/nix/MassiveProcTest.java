package com.nix;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MassiveProcTest {

    MassiveProc mcProc = new MassiveProc();
    @Test
    public void getFirstSign() {
        Assert.assertEquals(-1,mcProc.getFirstSign(new int[]{-3, 3, 4}));
    }
}
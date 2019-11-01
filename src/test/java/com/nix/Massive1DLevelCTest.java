package com.nix;

import org.junit.Test;

import static org.junit.Assert.*;

public class Massive1DLevelCTest {

    Massive1DLevelC mcLevelC = new Massive1DLevelC();
    @Test
    public void findMinRadius() {
        int[] massiveOfPoints = {2,4,5,1,1,1,2,3,3,4};
        assertEquals(2f,mcLevelC.findMinRadius(massiveOfPoints),0f);
    }
}
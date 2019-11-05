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

    @Test
    public void deleteDublicats() {
        int[] massive = {2,4,5,1,1,1,2,3,3,4};
        int[] expected = {2,4,5,1,3};
        assertArrayEquals(expected,mcLevelC.deleteDublicats(massive));
    }

    @Test
    public void overlapCount() {
        int[] massiveA = {1,2,3,4,5,6,7,8,9,10};
        int[] massiveB = {6,7,8,9,10,11,12,13};
        assertEquals(5,mcLevelC.overlapCount(massiveA,massiveB));
    }

    @Test
    public void findMaxGates() {
        int[] massive = {2,4,5,7,1,1,2,3,3,4};
        int[] expected = {4,5,7,1,1,2,3,3,4};
        assertArrayEquals(expected,mcLevelC.findMaxGates(massive));

        massive = new int[]{7, 6, 8,7,4,2,3,9,4};
        expected = new int[]{4,2,3,9,4};
        assertArrayEquals(expected,mcLevelC.findMaxGates(massive));
    }

    @Test
    public void moveMass() {
        int[] massive = {1,2,3,4,5,6,7,8,9,10};
        int[] expectedA = {6,7,8,9,10,1,2,3,4,5};
        int[] expectedB = {8,9,10,1,2,3,4,5,6,7};
        assertArrayEquals(expectedA,mcLevelC.moveMass(massive,5));
        assertArrayEquals(expectedB,mcLevelC.moveMass(massive,-2));
    }
}
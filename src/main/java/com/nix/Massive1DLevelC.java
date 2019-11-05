package com.nix;

import java.util.Arrays;

public class Massive1DLevelC {

    /*51*/
    public double findMinRadius(int[] massive){
        double radius = Double.MAX_VALUE;
        for (int i = 0; i < massive.length; i+=2) {
            radius = Math.min(Math.sqrt(massive[i]*massive[i]+massive[i+1]*massive[i+1]),radius);
        }
        return radius;
    }

    /*57*/
    public int[] deleteDublicats(int[] massive){
        int[] withoutDubs = new int[massive.length];
        int index = 0;
        for (int i = 0; i < massive.length; i++) {
            int j = 0;
            for (; j <index+1 ; j++) {
                if(massive[i]==withoutDubs[j])
                    break;
            }
            if(j==index+1) {
                withoutDubs[index] = massive[i];
                index++;
            }
        }
        return Arrays.copyOfRange(withoutDubs,0,index);
    }

    /*59*/
    public int overlapCount(int[] massiveA, int[] massiveB){
        int overlapCount = 0;
        int[] maxLengthMass;
        int[] minLengthMass;
        if(massiveA.length>massiveB.length) {
            maxLengthMass = massiveA;
            minLengthMass = massiveB;
        }
        else {
            maxLengthMass = massiveB;
            minLengthMass = massiveA;
        }

        for (int i = 0; i <maxLengthMass.length ; i++) {
            for (int j = 0; j < minLengthMass.length; j++) {
                if(maxLengthMass[i]==minLengthMass[j]) {
                    overlapCount++;
                    break;
                }
            }
        }
        return overlapCount;
    }
}

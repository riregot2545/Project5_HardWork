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

    /*66*/
    public int[] findMaxGates(int[] massive){
        //find all repeatable values
        int [][]repeatMatrix = new int[massive.length][2];
        int index = 0;
        boolean isHasGate = false;
        for (int i = 0; i < massive.length; i++) {
            for (int j = i+1; j <massive.length ; j++) {
                if(massive[i]==massive[j]) {
                    isHasGate = true;
                    repeatMatrix[index][0]=i;
                    repeatMatrix[index][1]=j;
                }
            }
            if(isHasGate)
                index++;
            isHasGate = false;
        }

        int maxLength = Integer.MIN_VALUE;
        int[] maxLengthPart = {};
        for (int i = 0; i < index+1; i++) {
            int length =  repeatMatrix[i][1]-repeatMatrix[i][0];
            if(maxLength<(length)) {
                maxLength = length;
                maxLengthPart = repeatMatrix[i];
            }
        }
        return Arrays.copyOfRange(massive,Math.min(maxLengthPart[0],maxLengthPart[1]),Math.max(maxLengthPart[0],maxLengthPart[1])+1);
    }

    /*67*/
    public int[] moveMass(int[] massive, int moveNums) {

        for (int i = 0; i < Math.abs(moveNums); i++) {
            if(moveNums>0) {
                int lastElement = massive[massive.length - 1];
                for (int j = 0; j < massive.length; j++) {
                    int current = massive[j];
                    massive[j] = lastElement;
                    lastElement = current;
                }
            }else {
                int lastElement = massive[0];
                for (int j = massive.length-1; j>-1; j--) {
                    int current = massive[j];
                    massive[j] = lastElement;
                    lastElement = current;
                }
            }

        }
        return massive;
    }
}

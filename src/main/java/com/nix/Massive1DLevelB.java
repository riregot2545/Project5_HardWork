package com.nix;

public class Massive1DLevelB {
    /*23*/
    public void moveOneAndZero(int[] massive){
        //Count sort method
        int countOfZeros = 0;
        for (int i :
                massive) {
            if (i == 0)
                countOfZeros++;
        }
        int i = 0;
        for (; i < countOfZeros; i++) {
            massive[i] = 0;
        }
        for (;i<massive.length;i++) {
            massive[i] = 1;
        }
    }
    /*24*/
    public void replaceAbsGreaterMax(int [] massive){
        int maxElement = Integer.MIN_VALUE;
        for (int num :
                massive) {
            if (maxElement < num)
                maxElement = num;
        }
        for (int i = 0; i < massive.length; i++) {
            if(Math.abs(massive[i])>maxElement){
                massive[i] = 0;
            }
        }
    }
}

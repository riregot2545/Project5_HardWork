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
}

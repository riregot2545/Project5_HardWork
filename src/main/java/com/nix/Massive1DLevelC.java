package com.nix;

public class Massive1DLevelC {

    /*51*/
    public double findMinRadius(int[] massive){
        double radius = Double.MAX_VALUE;
        for (int i = 0; i < massive.length; i+=2) {
            radius = Math.min(Math.sqrt(massive[i]*massive[i]+massive[i+1]*massive[i+1]),radius);
        }
        return radius;
    }
}

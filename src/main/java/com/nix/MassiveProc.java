package com.nix;

public class MassiveProc {

    /*3*/
    public int getFirstSign(int[] massive){
        for (int i = 0; i < massive.length; i++) {
            if(massive[0]!=0)
                return (int) Math.signum(massive[0]);
        }
       return 0;
    }

    /*7*/
    public int replaceByZ(int[] massive, int Z){
        int replaceNum = 0;
        for (int i = 0; i < massive.length; i++) {
            if(massive[i]>Z) {
                massive[i] = Z;
                replaceNum++;
            }
        }
        return replaceNum;
    }

    /*10*/
    public void replaceMaxAndMin(double[] massive){
        int maxValueIndex = 0;
        int minValueIndex = 0;

        for (int i = 0; i < massive.length; i++) {
            if(massive[i]>massive[maxValueIndex])
                maxValueIndex = i;
            if(massive[i]<massive[minValueIndex])
                minValueIndex = i;
        }

        double temp = massive[maxValueIndex];
        massive[maxValueIndex] = massive[minValueIndex];
        massive[minValueIndex] = temp;
    }
    /*13*/
    public void replaceOddAndEven(int [] massive){
        for (int i = 0; i < massive.length-1; i+=2) {
            int temp = massive[i+1];
            massive[i+1] = massive[i];
            massive[i] = temp;
        }
    }

}

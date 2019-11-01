package com.nix;

import java.util.Arrays;

public class Massive1DLevelB {

    public int getMaxElement(int[] massive){
        int maxElement = Integer.MIN_VALUE;
        for (int num :
                massive) {
            if (maxElement < num)
                maxElement = num;
        }
        return maxElement;
    }
    public int getMinElement(int[] massive){
        int minElement = Integer.MAX_VALUE;
        for (int num :
                massive) {
            if (minElement > num)
                minElement = num;
        }
        return minElement;
    }
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
        int maxElement = getMaxElement(massive);
        for (int i = 0; i < massive.length; i++) {
            if(Math.abs(massive[i])>maxElement){
                massive[i] = 0;
            }
        }
    }
    /*28*/
    public int[] insertIntoSequence(int[] massive,int b){
        int [] newMassive = new int[massive.length+1];
        boolean isInserted = false;
        for (int i = 0,j=0; i < newMassive.length; i++,j++) {
            if(!isInserted && b<=massive[j]) {
                newMassive[i] = b;
                isInserted = true;
                i++;
            }
            newMassive[i] = massive[j];
        }
        return newMassive;
    }

    /*33*/
    public int getCommonNum(int[] massive){
        Arrays.sort(massive);
        int startElement = massive[0];
        int maxCountElement = startElement;
        int maxCount = 1;
        int currentCount =1;
        for (int i = 1; i < massive.length; i++) {
            if(massive[i]==startElement)
                currentCount++;
            else {
                startElement = massive[i];
                if(maxCount<currentCount){
                    maxCountElement = massive[i-1];
                    maxCount = currentCount;
                }else if(maxCount==currentCount)
                    maxCountElement = Math.min(maxCountElement, massive[i-1]);
                currentCount = 0;
            }
        }
        return maxCountElement;
    }

    /*38*/
    public int[][] findSumPairs(int[] massive,int sumNum){
        int [][] resultSet = new int[massive.length / 2][2];
        int pairIndex = 0;
        for (int i = 0; i < massive.length-1; i++) {
            for (int j = i+1; j < massive.length; j++) {
                if((massive[i]+massive[j])==sumNum) {
                    resultSet[pairIndex][0] = massive[i];
                    resultSet[pairIndex][1] = massive[j];
                    pairIndex++;
                }


            }
        }
        return Arrays.copyOfRange(resultSet,0,pairIndex);
    }
    /*45*/
    public int[] findNumsWithEndK(int[] massive, int K){
        int [] resultMassive = new int[massive.length];
        int resultMassiveIndex = 0;
        for (int i = 0; i < massive.length; i++) {
            if(massive[i]%10==K) {
                resultMassive[resultMassiveIndex] = massive[i];
                resultMassiveIndex++;
            }
        }
        return Arrays.copyOfRange(resultMassive,0,resultMassiveIndex);
    }

    /*49*/
    public int[] getAgeGroups(int[] massive){
        Arrays.sort(massive);
        int[] ageGroups = new int[massive[massive.length-1]/10+1];
        Arrays.fill(ageGroups,0);
        int groupIndex = 0;
        for (int i = 0; i < massive.length; i++) {
            if(massive[i]>(groupIndex+1)*10)
                groupIndex++;
            ageGroups[groupIndex]++;
        }
        return ageGroups;
    }
}

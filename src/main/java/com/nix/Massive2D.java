package com.nix;

public class Massive2D {
    /*84*/
    public int[][] buildSquare(int size){
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            if(i==0 || i==size-1) {
                for (int j = 0; j < size; j++) {
                    matrix[i][j] = 1;
                }
            }
            matrix[i][0] = 1;
            matrix[i][size-1] = 1;
        }
        return matrix;
    }
}

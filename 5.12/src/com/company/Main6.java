package com.company;
public class Main6 {
    public static void main(String[] args){
        int[][] array = new int[15][];
        array [0] = new int [5];
        array [1] = new int [5];
        array [2] = new int [5];
        array [3] = new int [5];


        array [4] = new int [8];
        array [5] = new int [8];
        array [6] = new int [8];
        array [7] = new int [8];


        array [8] = new int [3];
        array [9] = new int [3];
        array [10] = new int [3];
        array [11] = new int [3];


        array [12] = new int [9];
        array [13] = new int [9];
        array [14] = new int [9];
        for(int q = 0; q <array.length; q++){
            for(int w = 0; w <array[q].length; w++){
                array[q][w]=(int)(Math.random()*15);
                System.out.print(array[q][w]+" ");
                    }
            System.out.println(" ");
                }
            }
        }

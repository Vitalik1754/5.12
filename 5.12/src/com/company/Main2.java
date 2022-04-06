package com.company;
public class Main2 {
    public static void main(String[] args) {

        int [] a = new int[19];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 9);
            System.out.print(a[i]+" ");

        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0)  a[i] = 0;
            System.out.print(a[i]+" ");


        }
    }
}

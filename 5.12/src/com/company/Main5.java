package com.company;
public class Main5 {
    public static void main(String[] args) {
            int q = 0;
            int a1 []  = new int[15];
            for (int i = 0; i < 15; i++) {
                a1[i] = (int) Math.round(Math.random() * 10);
            }
            for (int i = 0; i < 15; i++) {
                System.out.print(a1[i] + " ");
            }
            for (int i = 0; i < 15; i++) {
                if (a1[i] % 2 == 0)
                    q++;
            }
            System.out.println("\n" + q);
        }
    }


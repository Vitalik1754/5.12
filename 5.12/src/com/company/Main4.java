package com.company;
public class Main4 {
    public static void main(String[] args){
        int a1[] = new int[10];
        int b2[] = new int[10];
        System.out.print("Перший масив : ");
        for (int i = 0; i < 10; i++) {
            a1[i] = (int) Math.round(Math.random() * 10);
            System.out.print(a1[i] + " ");
        }
        System.out.println();
        System.out.print("Другий масив : ");
        for (int i = 0; i < 10; i++) {
            b2[i] = (int) Math.round(Math.random() * 10);
            System.out.print(b2[i] + " ");
        }
        System.out.println();
        System.out.print("Третій масив : ");
        int c3[] = new int[11];
        for (int i=0; i<10;i++) {
            if (a1[i] == b2[i]) {
                c3[i] = a1[i] + b2[i];
            }else if (a1[i] != b2[i]){
                c3[i] = 0;
            }
            System.out.print(c3[i] + " ");
        }
    }
}


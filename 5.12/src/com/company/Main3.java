package com.company;
public class Main3 {
    public static void main(String[] args) {
        int a1[] = new int[5];
        int q2[] = new int[5];
        int r3[] = new int[5];
        double mid1 = 0, mid2 = 0, mid3 = 0;
        for (int i = 0; i < 5; i++) {
            a1[i] = (int) Math.round(Math.random() * 5);
            mid1 = mid1 + a1[i];
            System.out.print(a1[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            q2[i] = (int) Math.round(Math.random() * 5);
            mid2 = mid2 + q2[i];
            System.out.print(q2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            r3[i] = (int) Math.round(Math.random() * 5);
            mid3 = mid3 + r3[i];
            System.out.print(r3[i] + " ");
        }
        System.out.println();
        System.out.println(mid1 = mid1 / 5);
        System.out.println(mid2 = mid2 / 5);
        System.out.println(mid3 = mid3 / 5);


        if (mid1 > mid2 && mid1 > mid3) {
            System.out.println("Найбільше середьно арефметичне є 1 масиву");
        } else if (mid2 > mid1 && mid2 > mid3) {
            System.out.println("Найбільше середьно арефметичне є 2 масиву");
        } else if (mid3 > mid1 && mid3 > mid2) {
            System.out.println("Найбільше середьно арефметичне є 3 масиву");
        }

            if (mid1 == mid2) {
                System.out.println("Однакові перший і другий ");
            } else if (mid2 == mid3) {
                System.out.println("Однакові друге і третє");
            } else if (mid1 == mid3){
                System.out.println("Однакові перше і третє");


        }

    }
}
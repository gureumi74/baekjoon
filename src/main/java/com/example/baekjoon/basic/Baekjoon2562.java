package com.example.baekjoon.basic;

import java.util.Scanner;

public class Baekjoon2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int save = 0;
        for (int i = 1; i < 10; i++) {
            int num = sc.nextInt();
            if (max < num) {
                max = num;
                save = i;
            }
        }
        System.out.println(max);
        System.out.println(save);
    }
}

package com.example.baekjoon.doitalgorithm;

import java.util.Scanner;

public class Baekjoon1546 {
    //평균
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long max = 0;
        long sum = 0;
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
            if (max < numbers[i]) {
                max = numbers[i];

            }
            sum += numbers[i];
        }
        System.out.println(sum * 100.0 / max / N);
    }
}

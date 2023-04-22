package com.example.baekjoon.doitalgorithm;

import java.util.Scanner;


public class Baekjoon11720 {
    // 숫자의 합
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] numbers = sc.next().toCharArray();
        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i] - '0';
        }

        System.out.println(sum);
    }
}

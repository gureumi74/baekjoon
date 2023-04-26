package com.example.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] bucket = new int[Integer.parseInt(st.nextToken())];
        int M = Integer.parseInt(st.nextToken());

        for(int n = 0; n < M; n++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for(int m = i - 1; m < j; m++) {
                bucket[m] = k;
            }
        }

        for(int i = 0; i < bucket.length; i++) {
            System.out.print(bucket[i] + " ");
        }
    }
}

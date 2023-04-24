package com.example.baekjoon.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (n < X) {
                System.out.printf("%d ", n);
            }
        }
    }
}

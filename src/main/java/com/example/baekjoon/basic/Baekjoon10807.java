package com.example.baekjoon.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] intArray = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i = 0; i < N; i++) {
            intArray[i] = Integer.parseInt(st.nextToken());
            if (intArray[i] == v) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}

package com.baekjoon.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 문제 : https://www.acmicpc.net/problem/18352
public class SpecialCityFinding {
    static int[] visited;
    static ArrayList<Integer>[] A;
    static int N, M, K, X;
    static List<Integer> answer; // 정답 배열 (거리)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt(); // 노드의 수;
        M = scanner.nextInt(); // 에지의 수;
        K = scanner.nextInt(); // 목표 거리;
        X = scanner.nextInt(); // 시작점;

        A = new ArrayList[N + 1];
        answer = new ArrayList<>();
    }
}

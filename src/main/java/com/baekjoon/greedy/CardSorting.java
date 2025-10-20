package com.baekjoon.greedy;

import java.util.PriorityQueue;
import java.util.Scanner;

// 문제 : https://www.acmicpc.net/problem/1715
public class CardSorting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int group = scanner.nextInt();

        // 들어가는 순서에 상관 없이 오름차순으로 기본정렬이 된다.
        PriorityQueue<Integer> cards = new PriorityQueue<>();
        for (int i = 0; i < group; i++) {
            int data = scanner.nextInt();
            cards.add(data);
        }

        int data1 = 0;
        int data2 = 0;
        int sum = 0;
        while (cards.size() != 1) {
            data1 = cards.remove();
            data2 = cards.remove();
            sum += data1 + data2; // 누적
            cards.add(data1 + data2);
        }

        System.out.println(sum); // 누적 합을 구해야 하기 때문에 cards.peek(); 과는 다른 결과
        scanner.close();


    }
}

package com.grammar.stream.basic;

import java.util.List;

public class StreamBasic02 {

    // 2번 부터는 gpt 제공 문제
    // 문제 2 : 👉 1부터 10까지의 숫자 리스트에서 모든 원소의 합을 스트림으로 구하라.
    // 정답 여부 : (x)
    // 원인 : Integer::intValue 라는 매퍼 사용법을 몰랐기 때문

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream()
                .mapToInt(Integer::intValue).sum();
        System.out.println("sum = " + sum);
        ;
    }
}

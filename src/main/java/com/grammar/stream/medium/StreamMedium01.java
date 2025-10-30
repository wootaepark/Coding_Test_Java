package com.grammar.stream.medium;

import java.util.List;

public class StreamMedium01 {

    // 문제 1 : 👉 1부터 10까지 숫자 중 짝수의 제곱의 합을 스트림으로 구하라.
    // 정답 여부 : O

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // int a = Integer.valueOf("1"); => Integer 로 반환 (auto boxing, unboxing), 범위 캐싱 제공
        // int b = Integer.parseInt("1"); => int 로 반환

        int result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n) // 실수 : Math.pow(n,2);
                .mapToInt(Integer::intValue) // intStream 으로 변환
                .sum();

        System.out.println("result = " + result);
    }
}

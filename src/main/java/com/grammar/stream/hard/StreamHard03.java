package com.grammar.stream.hard;

import java.util.stream.IntStream;

public class StreamHard03 {

    // 문제 3 : 1부터 20까지의 숫자 중 5의 배수만 골라 평균값을 구하라.
    // 정답 여부 : - (다른 더 좋은 방법이 있음)


    public static void main(String[] args) {
        
        // List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        // double result = nums.stream().mapToInt(Integer::intValue).filter(n->n%5==0).average().orElse(0);

        double result = IntStream.rangeClosed(1, 20)
                .filter(n -> n % 5 == 0)
                .average()
                .orElse(0);

        System.out.println("result = " + result);
    }
}

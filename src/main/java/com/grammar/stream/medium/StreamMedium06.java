package com.grammar.stream.medium;

import java.util.List;

public class StreamMedium06 {

    // 문제 5 : 문제 4와 반대로 최소값 출력하기
    // 정답 여부 : O

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 33, 2, 47, 19);

        int minNumber = numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElseThrow();

        System.out.println("minNumber = " + minNumber);
    }
}

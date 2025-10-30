package com.grammar.stream.medium;

import java.util.List;

public class StreamMedium05 {

    // 문제 4 : 스트림을 이용해 최댓값을 구하라
    // 정답 여부 : -

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 33, 2, 47, 19);
        int maxNumber = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow(); // 최댓값이 없는 경우 예외처리
        System.out.println("maxNumber = " + maxNumber);

    }
}

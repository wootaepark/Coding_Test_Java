package com.grammar.stream.basic;

import java.util.List;

public class StreamBasic03 {

    // 문제 3 : 👉 1부터 20까지의 숫자 리스트에서 짝수만 출력하라.
    // 정답 여부 : x 
    // 이유 : map 을 이용하려고 하다가 filter 를 잊어먹고 사용하지 못함

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

    }
}

package com.grammar.stream.medium;

import java.util.Comparator;
import java.util.List;

public class StreamMedium03 {

    // 문제 3 : 👉 위 words 리스트를 길이순 오름차순으로 정렬해 출력하라.
    // 정답 여부 : O
    // 원인 : sorted 중간 연산 메서드의 존재를 몰랐음

    public static void main(String[] args) {
        List<String> words = List.of("apple", "application", "banana", "app", "cat");

        words.stream()
                .sorted(Comparator.comparing(String::length)) // 방법 1. (기본 오름차순), 자동으로 comparingInt 로 boxing
                //.sorted((w1, w2) -> w1.length() - w2.length()) // 방법 2.
                // Comparator 를 사용,
                /*
                 * 결과가 음수인 경우 w1 이 w2 보다 앞
                 * 0 이면 순서 유지
                 * 양수인 경우 w2 가 w1 보다 앞
                 * */
                .forEach(System.out::println);


    }
}

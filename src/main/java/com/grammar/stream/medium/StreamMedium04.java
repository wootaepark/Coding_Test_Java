package com.grammar.stream.medium;

import java.util.Comparator;
import java.util.List;

public class StreamMedium04 {

    // 번외 문제 3-1 : 👉 위 words 리스트를 길이순 내림차순으로 정렬해 출력하라. (단, sorted 중간 함수에 Comparator 만을 사용할것)
    // 정답 여부 : x

    public static void main(String[] args) {
        List<String> words = List.of("apple", "application", "banana", "app", "cat");

        // 내림차순
        words.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                // .sorted((w1, w2) -> w2.length() - w1.length())
                .forEach(System.out::println);

    }
}

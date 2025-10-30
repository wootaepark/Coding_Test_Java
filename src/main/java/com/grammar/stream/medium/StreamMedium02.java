package com.grammar.stream.medium;

import java.util.List;

public class StreamMedium02 {

    // 문제 2 : 👉 "app"으로 시작하는 문자열만 골라 출력하라.
    // 정답 여부 : O

    public static void main(String[] args) {
        List<String> words = List.of("apple", "application", "banana", "app", "cat");

        words.stream()
                .filter(w -> w.startsWith("app"))
                .forEach(System.out::println);
    }


}

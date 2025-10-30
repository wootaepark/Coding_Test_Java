package com.grammar.stream.basic;

import java.util.List;

public class StreamBasic05 {

    // 문제 5 : 👉 List<String> fruits = List.of("apple", "banana", "grape"); 모든 문자열을 대문자로 변환하여 출력하라.
    // 정답 여부 : O

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "grape");
        fruits.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}

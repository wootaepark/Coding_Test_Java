package com.grammar.stream.basic;

import java.util.List;

public class StreamBasic04 {

    // 문제 4 : 👉 List<String> names = List.of("Java", "Python", "C", "Kotlin"); 에서 각 문자열의 길이를 출력하라.
    // 정답 여부 : O

    public static void main(String[] args) {
        List<String> names = List.of("Java", "Python", "C", "Kotlin");

        names.stream()
                .map(String::length)  //.map(name -> name.length())
                .forEach(System.out::println);
    }

}

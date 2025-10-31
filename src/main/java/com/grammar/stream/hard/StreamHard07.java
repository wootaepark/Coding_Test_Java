package com.grammar.stream.hard;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamHard07 {
    // 문제 7 : List<String> animals = List.of("cat", "cow", "dog", "deer", "duck");
    // 첫 글자 기준으로 그룹화(Map<Character, List<String>>) 하라.

    // c 로 시작하는 것은 c 끼리, d 로 시작하는 것은 d 끼리

    public static void main(String[] args) {
        List<String> animals = List.of("cat", "cow", "dog", "deer", "duck");

        Map<Character, List<String>> result = animals.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println("result = " + result);
    }
}

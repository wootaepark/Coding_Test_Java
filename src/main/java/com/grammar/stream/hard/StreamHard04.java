package com.grammar.stream.hard;

import java.util.List;

public class StreamHard04 {

    // 문제 4 : List<String> words = List.of("apple", "grape", "banana", "apricot", "kiwi");
    //'a' 문자를 포함하는 단어가 몇 개인지 세어라.
    public static void main(String[] args) {
        List<String> words = List.of("apple", "grape", "banana", "apricot", "kiwi");

        long count = words.stream()
                .filter(w -> w.contains("a"))
                .count();

        System.out.println("count = " + count);
    }
}

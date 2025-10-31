package com.grammar.stream.hard;

import java.util.List;

public class StreamHard06 {

    // 문제 6 : 이중 리스트를 단일 리스트로 변환하여 출력하라.
    // 정답 여부 : x (flatMap 이라는 중간 메서드 존재 몰랐음)

    public static void main(String[] args) {
        List<List<Integer>> numbers = List.of(
                List.of(1, 2),
                List.of(3, 4, 5),
                List.of(6)
        );

        List<Integer> flatList = numbers.stream()
                .flatMap(List::stream)
                .toList(); // .collect(Collectors.toList());

        System.out.println("flatList = " + flatList);


    }
}

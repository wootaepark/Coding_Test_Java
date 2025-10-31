package com.grammar.stream.hard;

import java.util.List;

public class StreamHard02 {

    // 문제 2 : 👉 중복을 제거하고 오름차순으로 정렬한 리스트를 출력하라.


    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 3, 9, 3, 5, 1, 9, 7);
        List<Integer> sortedNums = nums.stream()
                .distinct()
                .sorted() // java 16 이전 -> .collect(Collectors.toList());
                .toList();

        System.out.println("sortedNums = " + sortedNums);

    }
}

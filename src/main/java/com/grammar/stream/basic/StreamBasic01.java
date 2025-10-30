package com.grammar.stream.basic;

import java.util.List;

public class StreamBasic01 {

    // 특정 리스트의 n 칸 스킵된 부분 부터 출력하는 stream 예시

    public static void main(String[] args) {
        // 가지고 놀 수 있는 numbers 리스트

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        numbers.stream()
                .skip(3)
                .forEach(System.out::println);

        //long a = intStream.count(); // 이미 intStream 을 forEach 라는 종료 메서드를 사용했기 때문에 재사용 불가
    }

}

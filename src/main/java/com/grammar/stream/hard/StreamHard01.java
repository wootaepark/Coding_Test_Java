package com.grammar.stream.hard;

import java.util.List;

public class StreamHard01 {

    // 문제 1 :  👉 리스트의 문자열을 공백을 포함해 하나의 문자열로 합쳐라.

    public static void main(String[] args) {
        List<String> words = List.of("Java", "is", "fun"); // 원하는 결과 "Java is fun"

        // 방법 1 : String result = String.join(" ", words);
        // 방법 2 : String result = words.stream()
        //                .collect(Collectors.joining(" ")); // (수집 중심) ,문자열 전용으로 범용성 낮음

        // 방법 3 : StringBuilder 사용하기
        //        StringBuilder builder = new StringBuilder();
        //        for (String word : words) {
        //            builder.append(word).append(" ");
        //        }
        //        System.out.println("합쳐진 문자열 " + builder); // 끝에 " " 문자가 낭비

        // 방법 4 : stream 연습이니까 아래 방법 사용한다. (누적 중심), 누적이 많아지면 성능 저하
        String result = words.stream()
                .reduce((a, b) -> a + " " + b)
                .orElse(""); // 리스트가 비어있을 경우 빈 문자열 반환 , 이 경우 orElseThrow(); 써도 무관
        System.out.println("result = " + result);
        System.out.println("result 문자열의 길이 : " + result.length()); // 맨 끝 공백을 확인하기 위함
    }
}

package com.grammar.stream.hard;

import java.util.List;

public class StreamHard05 {

    // 문제 5 : 나이가 30 이상인 사람의 이름만 출력하라. (Person 클래스 이용)

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alice", 25),
                new Person("Bob", 35),
                new Person("Charlie", 30)
        );

        people.stream()
                .filter(p -> p.getAge() >= 30)
                .map(Person::getName)
                .forEach(System.out::println);
    }
}

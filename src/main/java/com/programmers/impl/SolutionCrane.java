package com.programmers.impl;

// 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/64061

import java.util.Stack;
import java.util.stream.IntStream;

public class SolutionCrane {
    public static void main(String[] args) {

        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        int sol = SolutionCrane.solution(board, moves);
        System.out.println("sol = " + sol);

    }

    private static int solution(int[][] board, int[] moves) {

        Stack<Integer> dolls = new Stack<>();

        int answer = 0;
        int n = board.length, m = board[0].length;

        // 각 열에서 가장 위에 있는 인형의 행 번호를 미리 구해놓음

        int[] topRow = IntStream.range(0, m)
                .map(i -> IntStream.range(0, n)
                        .filter(j -> board[j][i] != 0)
                        .findFirst()
                        .orElse(n))
                .toArray();

        for (int move : moves) {

            int col = move - 1;

            if (topRow[col] >= n) { // 더이상 뽑을 인형이 없다.
                continue;
            }

            if (!dolls.empty() && board[topRow[col]][col] == dolls.peek()) {
                dolls.pop();
                answer += 2;
                topRow[col]++; // else 문 입력 시 필요 x
                continue; // else 문 입력 시 필요 x


            }
            /*
            else{
                dolls.push(board[topRow[col]][col]);
                }
             */
            dolls.push(board[topRow[col]][col]);
            topRow[col]++;


        }

        return answer;
    }


}

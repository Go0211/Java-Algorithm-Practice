package programmers;

import java.util.Scanner;

//등차수열 구현
public class ArithmeticSequence {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("원하는 정수 : ");
        long x = scan.nextLong();
        System.out.print("원하는 갯수 : ");
        int n = scan.nextInt();

        long[] answer = solution(x, n);

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }

    //문제
    private static long[] solution(long x, int n) {
        long[] answer = new long[n];

        answer[0] = x;

        for(int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;
    }
}

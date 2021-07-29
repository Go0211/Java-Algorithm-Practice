package programmers;

import java.util.Scanner;

//정수 두 개 사이의 수 약수들의 합 구하기
//약수가 홀수면 -, 약수가 짝수면 +
public class SumAndCountMeasure {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("left : ");
        int left = scan.nextInt();
        System.out.print("right : ");
        int right = scan.nextInt();

        System.out.println("답 : " + solution(left, right));
    }

    //문제
    private static int solution(int left, int right) {
        int answer = 0;
        int count = 0;

        for(int i = left; i <= right; i++) {
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }

            if(i > 1 && count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }

            count = 0;
        }

        return answer;
    }
}

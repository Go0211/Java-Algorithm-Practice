package programmers;

import java.util.Scanner;

//제곱근 판별
public class CheckSquareRoot {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("수 : ");
        long num = scan.nextInt();

        if(solution(num) == -1) {
            System.out.println("제곱근이 아닙니다.");
        } else {
            System.out.println("제곱근입니다.");
        }
    }

    //문제
    private static long solution(long n) {
        long answer = -1;

        for (long i = 1; i <= n; i++) {
            if (n == i * i && n >= 1) {
                answer = (i + 1) * (i + 1);
                break;
            }
        }

        return answer;
    }

}

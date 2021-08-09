package programmers;

import java.util.Scanner;

//숫자를 연속된 정수의 합으로 표현하는 수들
public class NumberExpression {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("숫자 : ");
        int num = scan.nextInt();

        System.out.println(num + " => " + solution(num));
    }

    //문제
    private static int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; ) {
            int test = 0;
            int count = i;

            for(;;) {
                test += i;
                i++;

                if(test == n) {
                    answer++;
                    break;
                } else if(test > n) {
                    break;
                }
            }

            count++;
            i = count;
            test = 0;
        }

        return answer;
    }
}

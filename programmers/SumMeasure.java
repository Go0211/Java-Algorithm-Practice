package programmers;

import java.util.Scanner;

//약수들의 합
public class SumMeasure {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("수 : ");
        int num = scan.nextInt();

        System.out.println( num + "의 약수들의 합은 " + solution(num));
    }

    //문제
    private static int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }
}

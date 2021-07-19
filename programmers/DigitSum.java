package programmers;

import java.util.Scanner;

//10의 자릿수들의 합
public class DigitSum {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("수 : ");
        int num = scan.nextInt();

        System.out.println("자릿수의 합은 " + solution(num) + "입니다.");
    }

    //문제
    private static int solution(int n) {
        String s = Integer.toString(n);
        int answer = 0;

        for(int i = 0; i < s.length(); i++) {
            answer += (int)s.charAt(i)-48;
        }

        return answer;
    }
}

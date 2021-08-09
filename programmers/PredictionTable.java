package programmers;

import java.util.Scanner;

public class PredictionTable {
    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("총 인원 수(2의 n승) : ");
        int total = scan.nextInt();

        System.out.print("A : ");
        int a = scan.nextInt();
        System.out.print("B : ");
        int b = scan.nextInt();

        System.out.println("만날 수 있는 최소의 경우의 수 : " + solution(total, a, b));
    }

    //문제
    private static int solution(int n, int a, int b){
        int answer = 1;

        for(int i = 0; i < n / 2; i++) {
            a = (a / 2) + (a % 2);
            b = (b / 2) + (b % 2);

            if(a != b) {
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }
}

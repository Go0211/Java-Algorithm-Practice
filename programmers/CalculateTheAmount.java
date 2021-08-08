package programmers;

import java.util.Scanner;

//부족한 금액 계산하기
public class CalculateTheAmount {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("요금 : ");
        int price = scan.nextInt();

        System.out.print("소지금 : ");
        int money = scan.nextInt();

        System.out.print("횟수 : ");
        int count = scan.nextInt();

        System.out.println("결과 : " + solution(price, money, count));
    }

    //문제
    private static long solution(int price, long money, int count) {
        long answer = 0;

        for(int i = 1; i <= count; i++) {
            money -= price * i;
        }

        if(money >= 0) {
            return answer;
        } else {
            return Math.abs(money);
        }
    }
}

package programmers;

import java.util.Scanner;

public class DaySearchYear2016 {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("월 : ");
        int month = scan.nextInt();
        System.out.print("일 : ");
        int day = scan.nextInt();

        System.out.println(month + "월 " + day + "일의 요일은 " + solution(month, day) + "입니다.");
    }

    //문제
    private static String solution(int a, int b) {
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        int count = b;

        for(int i = 0; i < a - 1; i++) {
            count += month[i];
        }

        return days[count % 7];
    }
}

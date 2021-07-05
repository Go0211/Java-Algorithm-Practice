package algorithm210704;

import java.util.Scanner;

//날짜 구하는 알고리즘 구현
public class ExampleAlgorithm5 {
    static final int YES = 1;
    static final int NO = 0;

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int retry;

        System.out.println("그 해 경과 일수를 구합니다.");

        do {
            System.out.print("년 : ");
            int year = scan.nextInt();
            System.out.print("월 : ");
            int month = scan.nextInt();
            System.out.print("일 : ");
            int day = scan.nextInt();

            System.out.printf("그 해 %d일째 입니다.\n", dayOfYear(year, month, day));

            System.out.print("한 번 더? (1. yes / 0. no) : ");
            retry = scan.nextInt();
        } while(retry == YES);
    }

    //2차원 배열(평년 + 윤년)
    static int[][] mDay = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    //윤년판독
    static int leapJudge(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return YES;
        } else {
            return NO;
        }
    }

    //날짜 계산
    static int dayOfYear(int year, int month, int day) {
        int days = day;

        for (int i = 1; i < month; i++) {
            days += mDay[leapJudge(year)][i - 1];
        }

        return days;
    }
}

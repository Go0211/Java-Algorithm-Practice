package algorithm210704;

import java.util.Scanner;

public class Problem3 {
    static final int YES = 1;
    static final int NO = 0;

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int retry;

        System.out.println("그 해 남은 일수를 구합니다.");

        do {
            System.out.print("년 : ");
            int year = scan.nextInt();
            System.out.print("월 : ");
            int month = scan.nextInt();
            System.out.print("일 : ");
            int day = scan.nextInt();

            System.out.printf("그 해 남은 일입니다 : %d\n", leftDayOfYear(year, month, day));

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
    static int isLeap(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return YES;
        } else {
            return NO;
        }
    }

    //날짜 계산 (남은 날 계산)
    static int leftDayOfYear(int year, int month, int day) {
        int leftDays = 365 - day;

        for (int i = 1; i < month; i++) {
            leftDays -= mDay[isLeap(year)][i - 1];
        }

        return leftDays;
    }
}

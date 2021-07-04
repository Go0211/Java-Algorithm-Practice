package algorithm210704;

import java.util.Scanner;

public class Problem3 {

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
        } while(retry == 1);
    }

    //2차원 배열(평년 + 윤년)
    static int[][] mDay = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    //윤년판독
    static int isLeap(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return 1;
        } else {
            return 0;
        }
    }

    //날짜 계산 (남은 날 계산)
    static int leftDayOfYear(int y, int m, int d) {
        int leftDays = 365 - d;

        for (int i = 1; i < m; i++) {
            leftDays -= mDay[isLeap(y)][i - 1];
        }

        return leftDays;
    }
}

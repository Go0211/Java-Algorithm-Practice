package algorithm210704;

import java.util.Scanner;

//날짜 계산하는 알고리즘
public class Problem2 {

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

    //날짜 계산 (해당 메소드에 만드는 변수 없이)
    static int dayOfYear(int y, int m, int d) {
        while(m > 1) {
            d += mDay[isLeap(y)][m-1];
            m--;
        }

        return d;
    }
}

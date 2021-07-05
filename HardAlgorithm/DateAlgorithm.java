package HardAlgorithm;

import java.util.Scanner;

//입력한 날짜에서 입력한 n일보다 전 or 후인 날짜를 구하는 알고리즘
public class DateAlgorithm {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("년 : ");
        int year = scan.nextInt();
        System.out.print("월 : ");
        int month = scan.nextInt();
        System.out.print("일 : ");
        int day = scan.nextInt();

        YMD ymd = new YMD(year, month, day);

        System.out.print("원하는 행위를 선택하세요. 1) n일 전 / 2)n일 후");
        int choice = scan.nextInt();

        ymd = actChoice(ymd, choice);

        System.out.printf("%d %d %d", ymd.year, ymd.month, ymd.day);
    }

    //데이터 형식 및 before + after 메소드
    private static class YMD {
        int year;
        int month;
        int day;

        YMD(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        //n일 후 날짜
        YMD after(int insertNum) {
            if ((day + insertNum) < mDay[isLeap(year)][month -1]) {
                if (month > 11) {
                    day = (day + insertNum) - mDay[isLeap(year +1)][0];
                    month = 1;
                } else {
                    day = (day + insertNum) - mDay[isLeap(year)][month];
                    month += 1;
                }
            } else {
                day += insertNum;
            }

            YMD imsi = new YMD(year, month, day);

            return imsi;
        }

        //n일 전 날짜
        YMD before(int insertNum) {
            if ((day - insertNum) <= 0) {
                if (month > 11) {
                    day = mDay[isLeap(year +1)][0] + (day - insertNum);
                } else {
                    day = mDay[isLeap(year)][month] - (day - insertNum);
                }
            } else {
                day -= insertNum;
            }

            YMD imsi = new YMD(year, month, day);

            return imsi;
        }
    }

    //날짜를 가지는 2차원 배열
    static int[][] mDay = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    //윤년계산
    static int isLeap(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return 1;
        } else {
            return 0;
        }
    }

    //before or after를 정해준다.
    static YMD actChoice(YMD ymd, int choice) {
        if (choice == 1) {
            System.out.print("원하는 일을 정해주세요 : ");
            int i = scan.nextInt();
            ymd.before(i);
        } else if (choice == 2) {
            System.out.print("원하는 일을 정해주세요 : ");
            int i = scan.nextInt();
            ymd.after(i);
        } else {
            System.out.print("오류");
        }

        return ymd;
    }
}

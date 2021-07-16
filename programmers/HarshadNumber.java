package programmers;

import java.util.Scanner;

//하샤드 수
public class HarshadNumber {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("수 : ");
        int num = scan.nextInt();

        if(solution(num) == true) {
            System.out.println("하샤드 수 가능");
        } else {
            System.out.println("하샤드 수 불가능");
        }
    }

    //문제
    private static boolean solution(int x) {
        int sample = x;
        int value = 0;

        for (;;) {
            if (sample / 10 != 0) {
                value += sample % 10;
                sample /= 10;
            } else {
                value += sample;
                break;
            }
        }

        if (x % value == 0) {
            return true;
        } else {
            return false;
        }
    }
}


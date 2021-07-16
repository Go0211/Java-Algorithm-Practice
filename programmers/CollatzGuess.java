package programmers;

import java.util.Scanner;

//콜라츠 추측
public class CollatzGuess {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("수 : ");
        int num = scan.nextInt();

        if(solution(num) != -1) {
            System.out.println(num + "은 총 " + solution(num) + "번 걸립니다.");
        } else {
            System.out.println("500번 넘게 걸립니다.");
        }
    }

    //문제
    private static long solution(long num) {
        int count = 0;

        for(;;) {
            if(num == 1) {
                return count;
            } else if(num % 2 == 0) {
                num /= 2;
                count++;
            } else {
                num = num * 3 + 1;
                count++;
            }

            if(count > 500) {
                return -1;
            }
        }
    }
}

package programmers;

import java.util.Scanner;

//입력된 수만큼 수박을 반복하기
public class RepeatText {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("수 : ");
        int num = scan.nextInt();

        System.out.println(solution(num));
    }

    //문제
    private static String solution(int n) {
        String answer = "";

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                answer += '수';
            } else {
                answer += '박';
            }
        }

        return answer;
    }
}

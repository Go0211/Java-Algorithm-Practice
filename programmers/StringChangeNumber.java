package programmers;

import java.util.Scanner;

//문자를 숫자로 바꾸기
public class StringChangeNumber {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("수 : ");
        String string = scan.next();

        System.out.println(solution(string));
    }

    //문제
    private static int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }
}

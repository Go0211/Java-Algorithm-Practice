package programmers;

import java.util.Scanner;

//가운데 글자 가져오기
public class MiddleText {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("문자 : ");
        String text = scan.next();

        System.out.println(text + "의 가운데 문자는 " + solution(text) + "입니다");
    }

    //문제
    private static String solution(String s) {
        char[] c = new char[s.length()];
        String answer = "";

        for(int i = 0; i < c.length; i++) {
            c[i] = s.charAt(i);
        }

        if(c.length == 1) {
            answer = s;
        } else if(c.length % 2 == 0) {
            for(int i = (c.length / 2) - 1; i <= c.length / 2;i++ ) {
                answer += c[i];
            }
        } else {
            answer += c[c.length / 2];
        }

        return answer;
    }
}

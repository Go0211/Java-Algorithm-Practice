package programmers;

import java.util.Scanner;

//시저암호
public class CaesarCipher {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("문자 : ");
        String text = scan.next();
        System.out.print("밀고싶은 정도 : ");
        int num = scan.nextInt();

        System.out.println(text + "를 " + num + "번 이동시킨 결과 : " + solution(text, num));
    }

    //문제
    private static String solution(String s, int n) {
        String answer = "";

        for(int i = 0; i < s.length(); i++) {
            int tmp = (int)s.charAt(i);

            if(65 <= tmp && tmp <= 90) {
                if(tmp + n <= 90) {
                    tmp += n;
                } else {
                    tmp = tmp + n - 26;
                }
            } else if(97 <= tmp && tmp <= 122){
                if(tmp + n <= 122) {
                    tmp += n;
                } else {
                    tmp = tmp + n - 26;
                }
            }

            answer += (char)tmp;
        }

        return answer;
    }
}

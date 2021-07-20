package programmers;

import java.util.Scanner;

//p와 y의 갯수가 동일한 지 구하기
public class SameCharacterAmount {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("문장 : ");
        String text = scan.next();

        if (solution(text) == true) {
            System.out.println("갯수가 같습니다.");
        } else {
            System.out.println("갯수가 같지 않습니다.");
        }
    }

    //문제
    private static boolean solution(String s) {
        boolean answer = true;
        char[] c = new char[s.length()];
        int p = 0;
        int y = 0;

        for(int i = 0; i < c.length; i++) {
            c[i] = s.charAt(i);
        }

        for(int i = 0; i < c.length; i++) {
            if(c[i] == 'p' || c[i] == 'P') {
                p++;
            } else if(c[i] == 'y' || c[i] == 'Y') {
                y++;
            }
        }

        if(p != y) {
            answer = false;
        }

        return answer;
    }
}

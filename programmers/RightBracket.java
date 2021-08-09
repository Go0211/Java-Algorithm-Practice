package programmers;

import java.util.Scanner;

//괄호의 올바름 확인
public class RightBracket {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("괄호 : ");
        String bracket = scan.next();

        if (solution(bracket) == true) {
            System.out.println("올바른 괄호");
        } else {
            System.out.println("올바르지 못한 괄호");
        }
    }

    //문제
    private static boolean solution(String s) {
        int count = 0;
        boolean answer = true;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }

            if(count < 0) {
                return false;
            }
        }

        if(count != 0) {
            return false;
        }

        return answer;
    }
}

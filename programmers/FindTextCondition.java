package programmers;


import java.util.Scanner;

//문제 조건에 맞는 지 확인
public class FindTextCondition {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("문자 : ");
        String text = scan.next();

        if(solution(text) == true) {
            System.out.println("조건에 충족합니다.");
        } else {
            System.out.println("조건에 충족하지 않습니다.");
        }
    }

    //문제
    private static boolean solution(String s) {
        boolean answer = true;
        char[] c = new char[s.length()];

        for(int i = 0; i < c.length; i++) {
            c[i] = s.charAt(i);
        }

        if(s.length() == 4 || s.length() == 6) {
            for(int i = 0; i < c.length; i++) {
                if(!(48 <= c[i] && c[i] <= 57)) {
                    answer = false;
                }
            }
        } else {
            answer = false;
        }

        return answer;
    }
}

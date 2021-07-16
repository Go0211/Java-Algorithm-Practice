package programmers;

import java.util.Scanner;

//뒤 4자리빼고 다 가리기
public class SecretPhoneNumber {
    
    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("번호 입력");
        String phone_number = scan.next();

        System.out.println("번호 가림");
        System.out.print(solution(phone_number));
    }

    //문제
    private static String solution(String phone_number) {
        char[] star = new char[phone_number.length()];

        for (int i = 0; i < star.length; i++) {
            if (i < star.length - 4) {
                star[i] = '*';
            } else {
                star[i] = phone_number.charAt(i);
            }
        }

        String answer = String.valueOf(star);

        return answer;
    }

}

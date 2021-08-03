package programmers;

import java.util.Scanner;

//첫 문자가 대문자고 나머지가 소문자
public class JadenCaseString {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("문자 : ");
        String string = scan.next();

        System.out.print(string + " -> " + solution(string));
    }

    //문제
    private static String solution(String s) {
        String answer = "";
        String line = "";

        s = s.toLowerCase();

        String[] array = s.split(" ");

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() != 0) {
                line += Character.toUpperCase(array[i].charAt(0));

                for (int j = 1; j < array[i].length(); j++) {
                    line += array[i].charAt(j);
                }

                array[i] = line;
                line = "";
            }
        }

        for (int i = 0; i < array.length; i++) {
            answer += array[i];

            if (i != array.length - 1) {
                answer += " ";
            }
        }

        if (answer.length() != s.length()) {
            for (int i = answer.length(); i < s.length(); i++) {
                answer += " ";
            }
        }

        return answer;
    }
}

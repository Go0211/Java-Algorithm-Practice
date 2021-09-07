package programmers;

import java.util.Scanner;

//모음 사전
public class VowelDictionary {
    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("5자리 대문자 알파벳 모음을 입력하세요 : ");
        String word = scan.next();

        System.out.print(word + "의모음 사전 순서는 " + solution(word) + "입니다.");
    }

    //문제
    private static int solution(String word) {
        int[] array = new int[5];
        int[] mul = {780, 155, 30, 5, 1};
        int totalSum = 0;

        for(int i = 0; i < array.length; i++) {
            array[i] = 0;
        }

        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'A') {
                array[i] = 1;
            } else if(word.charAt(i) == 'E') {
                array[i] = 2;
            } else if(word.charAt(i) == 'I') {
                array[i] = 3;
            } else if(word.charAt(i) == 'O') {
                array[i] = 4;
            } else {
                array[i] = 5;
            }
        }

        // 빈칸끼리는 5곱하기 + 글자나온 거 0 ~ 4까지 곱하기 + 나머지는 더하기
        for(int i = 0; i < array.length; i++) {
            if(array[i] != 0) {
                totalSum += array[i] + ((array[i] - 1) * mul[i]);
            }
        }

        if(array[4] != 0) {
            totalSum -= ((array[4] - 1) * mul[4]);
        }

        int answer = totalSum;
        return answer;
    }
}

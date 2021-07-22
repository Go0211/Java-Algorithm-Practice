package programmers;

import java.util.Arrays;
import java.util.Scanner;

//입력된 수 인덱스로 정렬
public class IndexNumStandardSort {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열 크기 : ");
        int size = scan.nextInt();

        String[] array = new String[size];

        for(int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
            array[i] = scan.next();
        }

        System.out.print("인덱스 수 : ");
        int num = scan.nextInt();

        String[] answer = solution(array, num);

        for(int i = 0; i < array.length; i++) {
            System.out.print(i + " : " + answer[i] + " ");
        }
    }

    //문제
    private static String[] solution(String[] strings, int n) {

        for(int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].charAt(n) + strings[i];
        }

        Arrays.sort(strings);

        for(int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1);
        }

        return strings;
    }
}

package programmers;

import java.util.Arrays;
import java.util.Scanner;

//최댓값과 최솟값 리턴
public class ReturnMaxMin {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("문장 : ");
        String string = scan.next();

        System.out.println(string + " -> " + solution(string));
    }

    //문제
    private static String solution(String s) {
        String answer = "";

        String[] a = s.split(" ");
        int[] array = new int[a.length];

        for(int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(a[i]);
        }

        Arrays.sort(array);

        answer = Integer.toString(array[0]) + " "
                + Integer.toString(array[array.length - 1]);

        return answer;
    }
}

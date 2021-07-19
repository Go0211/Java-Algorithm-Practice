package programmers;

import java.util.Arrays;
import java.util.Scanner;

//정수를 내림차순으로 정렬
public class DescendingSort {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("수 : ");
        long num = scan.nextInt();

        System.out.println("정렬 전 : " + num);
        System.out.println("정렬 후 : " + solution(num));
    }

    //문제
    private static long solution(long n) {
        String s = Long.toString(n);
        char[] c = new char[s.length()];

        for(int i = 0; i < c.length; i++) {
            c[i] = s.charAt(i);
        }

        Arrays.sort(c);

        for(int i = 0; i < c.length / 2; i++) {
            char t = c[i];
            c[i] = c[c.length - (i+1)];
            c[c.length - (i+1)] = t;
        }

        s = String.valueOf(c);
        long answer = Long.parseLong(s);

        return answer;
    }
}

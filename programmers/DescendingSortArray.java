package programmers;

import java.util.Scanner;

//정수의 순서를 reverse 후 배열에 삽입
public class DescendingSortArray {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("수 : ");
        int num = scan.nextInt();

        for (int i = 0; i < solution(num).length; i++) {
                System.out.print(solution(num)[i] + " ");
        }
    }

    //문제
    private static long[] solution(long n) {
        String s = Long.toString(n);
        long[] c = new long[s.length()];

        for(int i = 0; i < c.length; i++) {
            c[i] = s.charAt(i) - 48;
        }

        for(int i = 0; i < c.length / 2; i++) {
            long t = c[i];
            c[i] = c[c.length - (i+1)];
            c[c.length - (i+1)] = t;
        }

        return c;
    }
}

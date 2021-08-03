package programmers;

import java.util.Scanner;

//피보나치 수
public class FibonacciNum {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("피보나치 수 : ");
        int num = scan.nextInt();

        System.out.println(num + " -> " + solution(num));
    }

    //문제
    private static int solution(int n) {
        int[] f = new int[n+1];

        f[0] = 0;
        f[1] = 1;

        for(int i = 2; i < f.length; i++) {
            f[i] = (f[i - 1] + f[i - 2]) % 1234567;
        }


        return f[n];
    }
}

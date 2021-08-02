package programmers;

import java.util.Scanner;

//두 배열이 내적해서 나온 값을 찾는 문제
public class DotProduct {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열의 크기 : ");
        int size = scan.nextInt();

        int[] a = new int[size];
        int[] b = new int[size];

        System.out.println("첫 배열");

        for(int i = 0; i < a.length; i++) {
            System.out.print(i + " : ");
            a[i] = scan.nextInt();
        }

        System.out.println("마지막 배열");

        for(int i = 0; i < b.length; i++) {
            System.out.print(i + " : ");
            b[i] = scan.nextInt();
        }

        System.out.println("두 배열끼리 내적한 결과 : " + solution(a, b));
    }

    //문제
    private static int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i = 0; i < a.length; i++) {
            answer += (a[i] * b[i]);
        }

        return answer;
    }
}

package programmers;

import java.util.Scanner;

//index에 맞춰 정수배열 + 음양배열하여 다 합친 정수 값을 구하는 문제
public class SumNegativePositive {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열 크기");
        int size = scan.nextInt();

        int[] absolutes = new int[size];
        boolean[] signs = new boolean[size];

        System.out.println("정수 배열");

        for (int i = 0; i < size; i++) {
            System.out.print(i + " : ");
            absolutes[i] = scan.nextInt();
        }

        System.out.println("음양 배열");

        for (int i = 0; i < size; i++) {
            System.out.print(i + " : ");
            signs[i] = scan.nextBoolean();
        }

        System.out.print(solution(absolutes, signs) + " ");
    }

    //문제
    private static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }

        return answer;
    }
}

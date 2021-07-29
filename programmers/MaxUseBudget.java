package programmers;

import java.util.Arrays;
import java.util.Scanner;

//예산을 최대한으로 사용가능한 수 구하기
public class MaxUseBudget {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("부서 수 : ");
        int total = scan.nextInt();

        int[] array = new int[total];

        for (int i = 0; i < total; i++) {
            System.out.print(i + " : ");
            array[i] = scan.nextInt();
        }

        System.out.print("예산 : ");
        int budget = scan.nextInt();

        System.out.println("답 : " + solution(array, budget));
    }

    //문제
    private static int solution(int[] d, int budget) {
        int total = 0;
        int answer = 0;

        Arrays.sort(d);

        for(int i = 0; i < d.length; i++) {
            total += d[i];
            answer++;

            if(budget < total) {
                answer--;
                break;
            }
        }

        return answer;
    }
}

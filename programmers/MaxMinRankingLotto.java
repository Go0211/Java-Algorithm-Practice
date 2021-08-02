package programmers;

import java.util.Scanner;

//로또번호 최대순위와 최소순위를 찾는 문제
public class MaxMinRankingLotto {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] lottos = new int[6];
        int[] win_nums = new int[6];

        System.out.println("로또 번호");

        for (int i = 0; i < lottos.length; i++) {
            System.out.print(i + " : ");
            lottos[i] = scan.nextInt();
        }

        System.out.println("1등 번호");

        for (int i = 0; i < win_nums.length; i++) {
            System.out.print(i + " : ");
            win_nums[i] = scan.nextInt();
        }

        System.out.printf("Max : " + solution(lottos, win_nums)[0] + "\n");
        System.out.printf("Min : " + solution(lottos, win_nums)[1] + "\n");

    }

    //문제
    private static int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;
        int zero = 0;
        int[] answer = new int[2];

        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    count++;
                }
            }

            if (lottos[i] == 0) {
                zero++;
            }
        }
        if (count == 0 && zero == 0) {
            answer[0] = 6;
            answer[1] = 6;
        } else if (count >= 2) {
            answer[0] = (win_nums.length + 1) - (count + zero);
            answer[1] = (win_nums.length + 1) - count;
        } else {
            answer[0] = (win_nums.length + 1) - (count + zero);
            answer[1] = 6;
        }

        return answer;
    }
}

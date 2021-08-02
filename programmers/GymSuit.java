package programmers;

import java.util.Arrays;
import java.util.Scanner;

//최대로 많이 체육을 할 수 있는 지 구하는 문제
//체육복없으면 참가 불가 + 대여는 1차이만 가능
public class GymSuit {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("총 인원 수 : ");
        int total = scan.nextInt();

        System.out.print("잃어버린 인원 수 : ");
        int lostSize = scan.nextInt();

        int[] lost = new int[lostSize];

        for(int i = 0; i < lostSize; i++) {
            System.out.print(i + " : ");
            lost[i] = scan.nextInt();
        }

        System.out.print("여벌의 체육복을 가진 인원의 수 : ");
        int reserveSize = scan.nextInt();

        int[] reserve = new int[reserveSize];

        for(int i = 0; i < reserveSize; i++) {
            System.out.print(i + " : ");
            reserve[i] = scan.nextInt();
        }

        System.out.println("최대로 체육을 할 수 있는 인원은 " + solution(total, lost, reserve));
    }

    //문제
    private static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i = 0; i < reserve.length; i++) {
            for(int j = 0; j < lost.length; j++) {
                if(reserve[i] - lost[j] == 0) {
                    answer++;
                    lost[j] = 0;
                    reserve[i] = 60 + reserve[i];
                }
            }
        }

        for(int i = 0; i < reserve.length; i++) {
            for(int j = 0; j < lost.length; j++) {
                if(Math.abs(reserve[i] - lost[j]) == 1) {
                    answer++;
                    lost[j] = 0;
                    reserve[i] = 60 + reserve[i];
                }
            }
        }

        return answer;
    }
}

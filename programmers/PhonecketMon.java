package programmers;

import java.util.Arrays;
import java.util.Scanner;

//가져갈 수 있는 폰켓몬의 종류의 최대갯수 구하기
//n개 중 최대 n/2개
public class PhonecketMon {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("폰켓몬의 수 : ");
        int phonecketMonNum = scan.nextInt();

        int[] nums = new int[phonecketMonNum];

        for(int i = 0; i < nums.length; i++) {
            System.out.print(i + " : ");
            nums[i] = scan.nextInt();
        }

        System.out.println("가져가도 좋은 폰켓몬의 갯수 : " + solution(nums));
    }

    //문제
    private static int solution(int[] nums) {
        int count = 1;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != nums[i+1]) {
                count++;
            }
        }

        if((nums.length / 2) < count) {
            return nums.length / 2;
        } else {
            return count;
        }
    }
}

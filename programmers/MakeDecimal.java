package programmers;

import java.util.ArrayList;
import java.util.Scanner;

//소수만드는 문제
public class MakeDecimal {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열의 크기 : ");
        int size = scan.nextInt();

        int[] nums = new int[size];

        for(int i = 0; i < nums.length; i++) {
            System.out.print(i + " : ");
            nums[i] = scan.nextInt();
        }

        System.out.println("소수의 갯수 : " + solution(nums));
    }

    //문제
    private static int solution(int[] nums) {
        int answer = 0;
        int x, y, z, num;
        boolean check = true;

        ArrayList<Integer> list = new ArrayList<Integer>();


        for(x = 0; x < nums.length - 2; x++) {
            y = x + 1;

            for(; y < nums.length - 1; y++) {
                z = y + 1;

                for(; z < nums.length; z++) {
                    num = nums[x] + nums[y] + nums[z];

                    for(int i = 2; i < num; i++) {
                        if(num % i == 0) {
                            check = false;
                            break;
                        }
                    }

                    if(check == true) {
                        answer++;
                    } else {
                        check = true;
                    }
                }
            }
        }

        return answer;
    }
}

package programmers;

import java.util.Scanner;

//짝수 홀수 판별
public class OddEven {
    
    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Solution s = new Solution();


        System.out.print("수 : ");
        int num = scan.nextInt();

        System.out.println( num + "은 " + s.solution(num) + "입니다.");
    }
}

//문제
class Solution {
    public String solution(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}

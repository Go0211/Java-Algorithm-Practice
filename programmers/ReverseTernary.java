package programmers;

import java.util.ArrayList;
import java.util.Scanner;

//10진법 -> 3진법 -> 뒤집기 -> 10진법 전환
public class ReverseTernary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("10진법 수 : ");
        int num = scan.nextInt();

        System.out.println(num + " -> " + solution(num));
    }

    //문제
    private static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(; n >= 3;) {
            list.add(n % 3);
            n = n / 3;
        }

        list.add(n);

        for(int i = 0; i < list.size(); i++) {
            answer += (int)(list.get(i) * Math.pow(3, list.size() - (i + 1)));
        }

        return answer;
    }
}

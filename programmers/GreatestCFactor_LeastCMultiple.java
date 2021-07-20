package programmers;

import java.util.Scanner;

//최대 공약수와 최소 공배수
public class GreatestCFactor_LeastCMultiple {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1 : ");
        long num1 = scan.nextLong();
        System.out.print("2 : ");
        long num2 = scan.nextLong();

        long[] array = solution(num1, num2);

        System.out.println("최소 공배수 : " + array[0]
                + " 최대 공약수 :" + array[1]);
    }

    //문제
    private static long[] solution(long n, long m) {
        //최대공약수는 두 개를 나누었을 때 나머지가 없는 수
        long big, small;
        long[] answer = new long[2];

        if(n >= m) {
            big = n;
            small = m;
        } else {
            big = m;
            small = n;
        }

        for(int i = 1; i <= big; i++) {
            if(n % i == 0 && m % i == 0) {
                answer[0] = i;
            }
        }

        for(int i = 1; i <= m*n; i++) {
            if(i % n == 0 && i % m == 0) {
                answer[1] = i;
                break;
            }
        }

        return answer;
    }
}

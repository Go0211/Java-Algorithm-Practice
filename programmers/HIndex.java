package programmers;

import java.util.Arrays;
import java.util.Scanner;

//H-Index
public class HIndex {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열의 크기 : ");
        int size = scan.nextInt();

        int[] array = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.print(i + " : ");
            array[i] = scan.nextInt();
        }

        System.out.println("H-Index : " + solution(array));
    }

    //문제
    private static int solution(int[] citations) {
        int answer = 0;
        int max = 0;

        Arrays.sort(citations);

        for(int i = 1; i <= citations.length; i++) {
            for(int j = 0; j < citations.length; j++) {
                if(citations[j] >= i) {
                    max++;
                }
            }

            if(max >= i) {
                answer = i;
            }

            max = 0;
        }

        return answer;
    }
}

package programmers;

import java.util.Arrays;
import java.util.Scanner;

//최솟값 만들기
public class MiniMunSum {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열 사이즈 : ");
        int size = scan.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        System.out.printf("배열 1\n");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(i + " : ");
            arr1[i] = scan.nextInt();
        }

        System.out.printf("배열 2\n");
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(i + " : ");
            arr2[i] = scan.nextInt();
        }

        System.out.println("최솟값 : " + solution(arr1, arr2));
    }

    //문제
    private static int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < B.length / 2; i++) {
            int tmp = B[B.length - (i + 1)];
            B[B.length - (i + 1)] = B[i];
            B[i] = tmp;
        }

        for (int i = 0; i < B.length; i++) {
            answer += A[i] * B[i];
        }

        return answer;
    }
}

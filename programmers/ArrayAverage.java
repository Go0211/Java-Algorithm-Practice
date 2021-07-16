package programmers;

import java.util.Scanner;

//배열 안 요소들의 평균값 구하기
public class ArrayAverage {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열 수 : ");
        int size = scan.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("[" + i + "] : ");
            array[i] = scan.nextInt();
        }

        System.out.println("평균 값 : " + solution(array));
    }

    //문제
    private static double solution(int[] arr) {
        double value = 0;

        for (int i = 0; i < arr.length; i++) {
            value += arr[i];
        }

        return value / arr.length;
    }
}

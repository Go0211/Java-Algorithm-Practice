package programmers;

import java.util.Scanner;

//비밀지도
public class SecretMap {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("비밀지도 크기");
        int size = scan.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print(i + " : ");
            arr1[i] = scan.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(i + " : ");
            arr2[i] = scan.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(solution(size, arr1, arr2)[i] + " ");
        }
    }

    //문제
    private static String[] solution(int n, int[] arr1, int[] arr2) {
        int[] list = new int[n];
        String[] answer = new String[n];
        int a = 0;

        for(int i = 0; i < n; i++) {
            list[i] = arr1[i] | arr2[i];
        }

        for(int i = 0; i < n; i++) {
            answer[i] = "";

            for(int j = n - 1; j >= 0; j--) {
                a = (int)(list[i] / Math.pow(2, j));
                list[i] = (int)(list[i] % Math.pow(2, j));

                if(a == 1) {
                    answer[i] += '#';
                } else {
                    answer[i] += ' ';
                }
            }
        }

        return answer;
    }
}

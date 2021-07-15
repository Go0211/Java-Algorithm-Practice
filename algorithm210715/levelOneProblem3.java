package algorithm210715;

import java.util.Scanner;

//행렬간 덧셈
public class levelOneProblem3 {
    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("행렬의 열");
        int a = scan.nextInt();
        System.out.print("행렬의 행");
        int b = scan.nextInt();

        int[][] arr1 = new int[a][b];
        int[][] arr2 = new int[a][b];

        System.out.println("첫 행렬의 값 : ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]");
                arr1[i][j] = scan.nextInt();
            }
        }

        System.out.println("두번째 행렬의 값 : ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]");
                arr2[i][j] = scan.nextInt();
            }
        }

        int[][] answer = solution(arr1, arr2);

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

    }

    //문제
    private static int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = arr1;

        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length; j++) {
                answer[i][j] += arr2[i][j];
            }
        }

        return answer;
    }
}

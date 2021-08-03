package programmers;

import java.util.Scanner;

//행렬의 곱셈
public class ProcessionMulti {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열1 행 크기");
        int line1 = scan.nextInt();
        System.out.print("배열1 열 크기");
        int row1 = scan.nextInt();

        System.out.print("배열2 행 크기");
        int line2 = scan.nextInt();
        System.out.print("배열2 열 크기");
        int row2 = scan.nextInt();

        int[][] arr1 = new int[line1][row1];
        int[][] arr2 = new int[line2][row2];

        System.out.print("첫 배열 ");
        for(int i = 0; i < line1; i++) {
            for(int j = 0; j < row1; j++) {
                System.out.print("[" + i + "]" + "[" + j +"] : " );
                arr1[i][j] = scan.nextInt();
            }
        }

        System.out.print("마지막 배열 ");
        for(int i = 0; i < line2; i++) {
            for(int j = 0; j < row2; j++) {
                System.out.print("[" + i + "]" + "[" + j +"] : " );
                arr2[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < solution(arr1, arr2).length; i++) {
            for(int j = 0; j < solution(arr1, arr2)[i].length; j++) {
                System.out.print(solution(arr1, arr2)[i][j] + " ");
            }

            System.out.println();
        }
    }

    //문제
    private static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        int num = 0;

        for(int a = 0; a < arr1.length; a++) {
            for(int b = 0; b < arr2[0].length; b++) {
                for(int c = 0; c < arr2.length; c++) {
                    num += arr1[a][c] * arr2[c][b];
                }

                answer[a][b] = num;
                num = 0;
            }
        }

        return answer;
    }
}

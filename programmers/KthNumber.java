package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//시작점과 끝점과 찾으려는 순서를 2차원배열로 주고 그걸 찾아내는 문제
public class KthNumber {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1차원 배열 크기");
        int size = scan.nextInt();

        System.out.print("2차원 배열 크기");
        int commandSize = scan.nextInt();

        int[] array = new int[size];
        int[][] command = new int[commandSize][3];

        for (int i = 0; i < size; i++) {
            System.out.print(i + " : ");
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < command.length; i++) {
            for (int j = 0; j < command[i].length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "] : ");
                command[i][j] = scan.nextInt();
            }
        }

        for (int j = 0; j < solution(array, command).length; j++) {
            System.out.print(solution(array, command)[j]);
        }
    }

    //문제
    private static int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {
            for(int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                list.add(array[j]);
            }

            Collections.sort(list);

            answer[i] = list.get(commands[i][2] - 1);

            list.clear();
        }

        return answer;
    }
}

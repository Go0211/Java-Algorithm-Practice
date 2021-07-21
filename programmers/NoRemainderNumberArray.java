package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//숫자배열에서 주어진 수에 맞아떨어지는 수 찾기
public class NoRemainderNumberArray {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열의 크기");
        int size = scan.nextInt();

        int[] array = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.print(i + " : ");
            array[i] = scan.nextInt();
        }

        System.out.print("나누려는 수 : ");
        int divider = scan.nextInt();

        if(solution(array, divider)[0] == -1) {
            System.out.println("나누어 떨어진 수가 없습니다. ");
        } else {
            System.out.print("나누어 떨어진 수는 ");

            for (int i = 0; i < solution(array, divider).length; i++) {
                System.out.print(solution(array, divider)[i] + " ");
            }

            System.out.println("입니다.");
        }
    }

    //문제
    private static int[] solution(int[] arr, int divisor) {
        int[] failure = {-1};

        Arrays.sort(arr);

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];

        if(list.size() == 0) {
            return failure;
        } else {
            for(int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }
        }

        return answer;
    }
}

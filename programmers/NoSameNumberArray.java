package programmers;

import java.util.ArrayList;
import java.util.Scanner;

//중복되는 수를 제외한 배열
public class NoSameNumberArray {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열 크기 : ");
        int size = scan.nextInt();

        int[] array = new int[size];

        for(int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
            array[i] = scan.nextInt();
        }

        int[] answer = solution(array);

        for(int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }

    //문제
    private static int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;

        list.add(arr[0]);

        for(int i = 1; i < arr.length; i++) {
            if(list.get(count) != arr[i]) {
                list.add(arr[i]);
                count++;
            }
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

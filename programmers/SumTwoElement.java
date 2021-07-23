package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//배열 두 요소들을 더한 새로운 배열
public class SumTwoElement {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열의 크기 : ");
        int size = scan.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print(i + " : ");
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < solution(array).length; i++) {
            System.out.print(solution(array)[i] + " ");
        }
    }

    //문제
    private static int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }

        Collections.sort(list);

        list.add(list.get(list.size() - 1) + 1);

        for(int i = 0; i < list.size() - 1; i++) {
            if((int)list.get(i) != (int)list.get(i+1)) {
                list2.add(list.get(i));
            }
        }

        int[] answer = new int[list2.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = list2.get(i);
        }

        return answer;
    }
}

package programmers;

import java.util.Scanner;

//배열의 가장 작은 수를 제외
public class DeleteSmallNumber {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열 길이 : ");
        int num = scan.nextInt();

        int[] array = new int[num];

        for(int i = 0; i < array.length; i++) {
            System.out.print("[" + (i+1) + "] : ");
            array[i] = scan.nextInt();
        }

        int[] answer = solution(array);

        System.out.print("가장 작은 수를 뺀 배열요소들입니다.");

        for(int i = 0; i < solution(array).length; i++) {
            System.out.print(answer[i] + " ");
        }
    }

    //문제
    public static int[] solution(int[] arr) {
        int[] answer  = new int[arr.length - 1];
        int[] noAnswer = {-1};
        int value = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[value] > arr[i]) {
                value = i;
            }
        }

        for(int i = 0; i < arr.length - 1; i++) {
            if(i < value){
                answer[i] = arr[i];
            } else {
                answer[i] = arr[i+1];
            }
        }

        if(arr.length <= 1){
            return noAnswer;
        } else {
            return answer;
        }
    }
}
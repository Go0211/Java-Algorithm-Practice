package algorithm210703;

import java.util.Scanner;

//역순으로 바뀌는 걸 일일이 보여주는 알고리즘
public class Problem2 {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열의 크기를 선택하세요 : ");
        int arraySize = scan.nextInt();

        int[] array = new int[arraySize];

        for (int imsiNum = 0; imsiNum < array.length; imsiNum++) {
            System.out.print((imsiNum+1) + " 번쨰 : ");
            array[imsiNum] = scan.nextInt();
        }

        System.out.println();
        reverseOrderArray(array);

        System.out.println("역순 정렬 끝났습니다.");
    }

    //배열의 요소들을 역순으로 교환
    static void reverseOrderArray(int[] array) {
        for (int imsiNum = 0; (imsiNum < array.length / 2); imsiNum++) {
            swapArray(array, imsiNum, (array.length - (imsiNum+1)));

            for (int imsi = 0; imsi < array.length; imsi++) {
                System.out.print(array[imsi]);
            }

            System.out.println();
            System.out.print("array[" + imsiNum + "]과 array[" + (array.length - (imsiNum + 1)) + "] 을 바꿨습니다.");
            System.out.println();
        }
    }

    //배열의 요소를 교환하는 메소드
    static void swapArray(int[] array, int element1, int element2) {
        int temp = array[element1];
        array[element1] = array[element2];
        array[element2] = temp;
    }
}

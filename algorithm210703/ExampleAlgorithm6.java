package algorithm210703;

import java.util.Scanner;

//배열의 값을 역순으로 배치하는 알고리즘 예제
public class ExampleAlgorithm6 {

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

        for (int imsiNum = 0; imsiNum < array.length; imsiNum++) {
            System.out.println((imsiNum+1) + " 번쨰 : " + array[imsiNum]);
        }
    }

    //역순으로 교환하는 메소드
    static void reverseOrderArray(int[] array) {
        for (int imsiNum = 0; (imsiNum < array.length / 2); imsiNum++) {
            swapArray(array, imsiNum, (array.length - (imsiNum+1)));
        }
    }

    //배열의 요소를 교환하는 메소드
    static void swapArray(int[] array, int element1, int element2) {
        int temp = array[element1];
        array[element1] = array[element2];
        array[element2] = temp;
    }
}

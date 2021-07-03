package algorithm210703;

import java.util.Scanner;

//b배열의 요소들을 a배열에 서순에 맞게 복사
public class Problem4 {
    static Scanner scan = new Scanner(System.in);

    //메인
    public static void main(String[] args) {
        System.out.print("첫 번째 원하는 배열의 크기를 정해주세요 : ");
        int arraySizeOne = scan.nextInt();
        int[] arrayOne = insertArrayElement(arraySizeOne);

        System.out.print("두 번째 원하는 배열의 크기를 정해주세요 : ");
        int arraySizeTwo = scan.nextInt();
        int[] arrayTwo = insertArrayElement(arraySizeTwo);

        copy(arrayOne, arrayTwo);

        System.out.println("완료했습니다");
        for (int imsiNum = 0; imsiNum < arrayOne.length; imsiNum++) {
            System.out.print(arrayOne[imsiNum]);
        }
        System.out.println();

        for (int imsiNum = 0; imsiNum < arrayTwo.length; imsiNum++) {
            System.out.print(arrayTwo[imsiNum]);
        }
    }

    //b배열를 a배열에 복사
    static void copy(int[] arrayOne, int[] arrayTwo) {
        for (int imsiNum = 0; imsiNum < arrayTwo.length; imsiNum++) {
            arrayOne[imsiNum] = arrayTwo[imsiNum];
        }
    }

    //배열안 요소에 값 넣기
    static int[] insertArrayElement(int num) {
        int[] result = new int[num];

        for (int imsiNum = 0; imsiNum < result.length; imsiNum++) {
            System.out.print((imsiNum+1) + "번째의 요소 값을 입력해주세요 : ");
            result[imsiNum] = scan.nextInt();
        }

        return result;
    }
}

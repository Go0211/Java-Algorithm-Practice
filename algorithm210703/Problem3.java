package algorithm210703;

import java.util.Scanner;

//배열요소들의 합 구하는 알고리즘
public class Problem3 {

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
        int total = sumArrayElement(array);

        System.out.println("배열요소들의 합은 " + total + "입니다.");
    }

    //배열 요소들을 더하는 메서드
    static int sumArrayElement(int[] array) {
        int total = 0;

        for (int imsiNum = 0; imsiNum < array.length; imsiNum++) {
            total += array[imsiNum];
        }

        return total;
    }
}

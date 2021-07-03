package algorithm210703;

import java.util.Scanner;

//배열의 값을 역순으로 배치하는 알고리즘 예제
public class ExampleAlgorithm6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열의 크기를 선택하세요 : ");
        int a = scan.nextInt();

        int[] array = new int[a];

        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1) + " 번쨰 : ");
            array[i] = scan.nextInt();
        }

        System.out.println();
        reverseOrderArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + " 번쨰 : " + array[i]);
        }
    }

    static void reverseOrderArray(int[] array) {
        for (int i = 0; (i < array.length / 2); i++) {
            swapArray(array, i, (array.length - (i+1)));
        }
    }

    static void swapArray(int[] a, int b1, int b2) {
        int temp = a[b1];
        a[b1] = a[b2];
        a[b2] = temp;
    }
}

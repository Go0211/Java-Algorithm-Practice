package algorithm210703;

import java.util.Scanner;

//역순으로 바뀌는 걸 일일이 보여주는 알고리즘
public class Problem2 {
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

        System.out.println("역순 정렬 끝났습니다.");
    }

    static void reverseOrderArray(int[] array) {
        for (int i = 0; (i < array.length / 2); i++) {
            swapArray(array, i, (array.length - (i+1)));

            for (int a = 0; a < array.length; a++) {
                System.out.print(array[a]);
            }

            System.out.println();
            System.out.print("a[" + i + "]과 a[" + (array.length - (i + 1)) + "] 을 바꿨습니다.");
            System.out.println();
        }
    }

    static void swapArray(int[] a, int b1, int b2) {
        int temp = a[b1];
        a[b1] = a[b2];
        a[b2] = temp;
    }
}

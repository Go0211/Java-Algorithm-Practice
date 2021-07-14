package algorithm210714;

import java.util.Scanner;

//퀵 정렬
public class ExampleAlgorithm1 {
    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("요솟 수 : ");
        int size = scan.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print(i + ": ");
            array[i] = scan.nextInt();
        }

        quickSort(array, 0, array.length - 1);

        System.out.println("오름차순으로 정렬");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //비교
    private static void quickSort(int[] array, int left, int right) {
        int pl = left;
        int pr = right;
        int x = array[(left+right) / 2];

        do {
            while (array[pl] < x) {
                pl++;
            }
            while (array[pr] > x) {
                pr--;
            }

            if (pl <= pr) {
                swap(array, pl++, pr--);
            }
        } while (pl <= pr);

        if (left < pr) {
            quickSort(array, left, pr);
        }
        if (pl < right) {
            quickSort(array, pl, right);
        }

    }

    //교환
    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

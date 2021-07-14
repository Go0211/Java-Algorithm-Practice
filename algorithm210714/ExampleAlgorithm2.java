package algorithm210714;

import java.util.Scanner;

//병합 정렬
public class ExampleAlgorithm2 {
    static int[] buff;

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

        mergeSort(array, array.length);

        System.out.println("오름차순으로 정렬");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //비교
    private static void mergeSort(int[] array, int n) {
        buff = new int[n];

        __mergeSort(array, 0, n - 1);

        buff = null;
    }

    //교환
    private static void __mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int i;
            int center = (left + right) / 2;
            int p = 0;
            int j = 0;
            int k = left;

            __mergeSort(array, left, center);
            __mergeSort(array, center + 1, right);

            for (i = left; i <= center; i++) {
                buff[p++] = array[i];
            }

            while (i <= right && j < p) {
                array[k++] = (buff[j] <= array[i]) ? buff[j++] : array[i++];
            }

            while (j < p) {
                array[k++] = buff[j++];
            }
        }
    }
}

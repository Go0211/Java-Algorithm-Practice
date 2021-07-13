package algorithm210713;

import java.util.Scanner;

//단순 선택 정렬
public class ExampleAlgorithm2 {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("길이 : ");
        int size = scan.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " : ");
            array[i] = scan.nextInt();
        }

        selectionSort(array);

        System.out.println("오름차순 정렬");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //값 비교
    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            swap(array, min, i);
        }
    }

    //값 교환환
    private static void swap(int[] array, int min, int i) {
        int temp = array[min];
        array[min] = array[i];
        array[i] = temp;
    }
}

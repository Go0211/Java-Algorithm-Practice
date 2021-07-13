package algorithm210713;

import java.util.Scanner;

//단순 삽입 정렬
public class ExampleAlgorithm3 {

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

        insertionSort(array);

        System.out.println("오름차순 정렬");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //값 비교및 교환
    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j;
            int temp = array[i];

            for (j = i; j > 0 && array[j - 1] > temp; j--) {
                array[j] = array[j - 1];
            }

            array[j] = temp;
        }
    }
}

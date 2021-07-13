package algorithm210713;

import java.util.Scanner;

//버블 정렬 오름차순
public class ExampleAlgorithm1 {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열의 크기 : ");
        int size = scan.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("요소 : ");
            array[i] = scan.nextInt();
        }

        bubbleSort(array);

        System.out.println("오름차순 정렬입니다.");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //요소들 비교
    private static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    swap(array, j-1, j);
                }
            }
        }
    }

    //요소들 교환
    private static void swap(int[] array, int a, int b) {
        int temp= array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}

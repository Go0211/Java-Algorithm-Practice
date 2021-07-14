package algorithm210714;

import java.util.Scanner;

//힙 정렬
public class ExampleAlgorithm6 {

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

        heapSort(array, size);

        System.out.println("오름차순으로 정렬");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //교환
    private static void swap(int[] array, int idx1, int idx2) {
        int tmp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = tmp;
    }

    //힙정렬
    private static void heapSort(int[] array, int size) {
        for (int i = (size - 1) / 2; i >= 0; i--) {
            downHeap(array, i, size - 1);
        }

        for (int i = size -1; i > 0; i--) {
            swap(array, 0 , i);
            downHeap(array, 0, i - 1);
        }
    }

    //힙 제작
    private static void downHeap(int[] array, int left, int right) {
        int temp = array[left];
        int child, parent;

        for (parent = left; parent < (right + 1) / 2; parent = child) {
            int cl = parent * 2 + 1;
            int cr = cl + 1;
            child = (cr <= right && array[cr] > array[cl]) ? cr : cl;

            if (temp >= array[child]) {
                break;
            }

            array[parent] = array[child];
        }

        array[parent] = temp;
    }
}

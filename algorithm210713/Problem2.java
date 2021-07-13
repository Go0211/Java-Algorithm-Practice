package algorithm210713;

import java.util.Scanner;

//양방향 버블 정렬
public class Problem2 {

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

    //값 비교
    private static void bubbleSort(int[] array) {
        int min = 0;
        int max = array.length - 1;
        int minCount = 0;
        int maxCount = 0;

        for (int i = 0; i < array.length; i++) {
            for (int ii = 0; ii < array.length; ii++) {
                System.out.print(array[ii]);
            }

            System.out.println();

            if (i % 2 == 1) {
                for (int z = minCount; z < array.length - maxCount; z++) {
                    if (array[min] > array[z]) {
                        min = z;
                    }
                }

                swapMin(array, min, minCount);
                min = array.length - 1;
                minCount++;
            } else {
                for (int j = minCount; j < array.length - maxCount; j++) {
                    if (array[max] < array[j]) {
                        max = j;
                    }
                }

                swapMax(array, max, maxCount);
                max = 0;
                maxCount++;
            }
        }

    }

    //최댓값 교환
    private static void swapMax(int[] array, int a, int count) {
        int temp = array[array.length - (count + 1)];
        array[array.length - (count + 1)] = array[a];
        array[a] = temp;
    }

    //최솟값 교환
    private static void swapMin(int[] array, int a, int count) {
        int temp = array[count];
        array[count] = array[a];
        array[a] = temp;
    }
}

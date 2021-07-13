package algorithm210713;

import java.util.Scanner;

//셸 정렬
public class ExampleAlgorithm4 {
    
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

        shellSort(array, size);

        System.out.println("오름차순 정렬");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
    //값 비교 및 교환
    private static void shellSort(int[] a, int n) {
        int h;
        for (h = 1; h < n / 9; h = h * 3 + 1) {
            ;
        }
        
        for (; h > 0; h /= 3) {
            for (int i = h; i < n; i++) {
                int j;
                int temp = a[i];
                
                for (j = i - h; j >= 0 && a[j] > temp; j -= h) {
                    a[j + h] = a[j];
                }
                
                a[j + h] = temp;
            }
        }
    }
    
}

package algorithm210714;

import java.util.Arrays;
import java.util.Scanner;

//Arrays를 이용한 퀵 정렬
public class ExampleAlgorithm3 {

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

        Arrays.sort(array);

        System.out.println("오름차순으로 정렬");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

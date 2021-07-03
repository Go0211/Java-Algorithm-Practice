package algorithm210703;

import java.util.Scanner;

//배열요소들의 합 구하는 알고리즘
public class Problem3 {
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
        int total = sumArrayElement(array);

        System.out.println("배열요소들의 합은 " + total + "입니다.");
    }

    static int sumArrayElement(int[] array) {
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        return total;
    }
}

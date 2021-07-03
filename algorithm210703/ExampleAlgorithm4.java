package algorithm210703;

import java.util.Scanner;

//최댓값을 구하는 알고리즘 예제
public class ExampleAlgorithm4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("구할 인원수를 넣어주세요 : ");
        int num = scan.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1) + "번째 사람 의 키 : ");
            array[i] = scan.nextInt();
        }

        int max = maxArray(array);

        System.out.print("키의 최댓값은 " + max + "입니다.");

    }

    static int maxArray(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}

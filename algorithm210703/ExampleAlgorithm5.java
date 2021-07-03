package algorithm210703;

import java.util.Random;
import java.util.Scanner;

//난수를 추가하여 최댓값을 찾는 알고리즘 예제
public class ExampleAlgorithm5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("난수를 넣을 갯수를 입력하세요 : ");
        int a = scan.nextInt();

        int[] array = new int[a];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(9999) + 1;
            System.out.println(i + " 번쨰 : " + array[i]);
        }

        int max = maxArray(array);

        System.out.println("최댓값은 : " + max + "입니다." );
    }

    private static int maxArray(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}

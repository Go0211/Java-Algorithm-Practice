package algorithm210703;

import java.util.Random;

//난수로 갯수 + 배열에 넣는 값을 지정
public class Problem1 {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.print("난수로 최대값을 찾을 갯수를 입력합니다 : ");
        int a = rand.nextInt(10);
        System.out.println(a);

        int[] array = new int[a];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(9999) + 1;
            System.out.println((i+1) + " 번쨰 : " + array[i]);
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

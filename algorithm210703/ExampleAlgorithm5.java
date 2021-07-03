package algorithm210703;

import java.util.Random;
import java.util.Scanner;

//난수를 추가하여 최댓값을 찾는 알고리즘 예제
public class ExampleAlgorithm5 {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("난수를 넣을 갯수를 입력하세요 : ");
        int randNum = scan.nextInt();

        int[] array = new int[randNum];

        for (int imsiNum = 0; imsiNum < array.length; imsiNum++) {
            array[imsiNum] = rand.nextInt(9999) + 1;
            System.out.println(imsiNum + " 번쨰 : " + array[imsiNum]);
        }

        int maxNum = maxArray(array);

        System.out.println("최댓값은 : " + maxNum + "입니다." );
    }

    //배열의 최댓값을 구하는 메소드
    private static int maxArray(int[] array) {
        int maxNum = array[0];

        for (int imsiNum = 1; imsiNum < array.length; imsiNum++) {
            if (array[imsiNum] > maxNum) {
                maxNum = array[imsiNum];
            }
        }

        return maxNum;
    }
}

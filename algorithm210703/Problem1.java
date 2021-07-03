package algorithm210703;

import java.util.Random;

//난수로 갯수 + 배열에 넣는 값을 지정
public class Problem1 {

    //메인
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.print("난수로 최대값을 찾을 갯수를 입력합니다 : ");
        int randNum = rand.nextInt(10);
        System.out.println(randNum);

        int[] array = new int[randNum];

        for (int imsiNum = 0; imsiNum < array.length; imsiNum++) {
            array[imsiNum] = rand.nextInt(9999) + 1;
            System.out.println((imsiNum+1) + " 번쨰 : " + array[imsiNum]);
        }

        int maxNum = maxArray(array);

        System.out.println("최댓값은 : " + maxNum + "입니다." );
    }

    //배열 요소들의 최댓값을 구하는 메소드
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

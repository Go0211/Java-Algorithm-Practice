package algorithm210703;

import java.util.Scanner;

//최댓값을 구하는 알고리즘 예제
public class ExampleAlgorithm4 {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("구할 인원수를 넣어주세요 : ");
        int arraySize = scan.nextInt();

        int[] array = new int[arraySize];

        for (int imsiNum = 0; imsiNum < array.length; imsiNum++) {
            System.out.print((imsiNum+1) + "번째 사람 의 키 : ");
            array[imsiNum] = scan.nextInt();
        }

        int maxNumber = maxArray(array);

        System.out.print("키의 최댓값은 " + maxNumber + "입니다.");
    }

    //배열의 요소 최댓값을 구하는 메소드
    static int maxArray(int[] array) {
        int maxNumber = array[0];

        for (int imsiNum = 1; imsiNum < array.length; imsiNum++) {
            if (array[imsiNum] > maxNumber) {
                maxNumber = array[imsiNum];
            }
        }

        return maxNumber;
    }
}

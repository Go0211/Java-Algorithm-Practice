package algorithm210706;

import java.util.Scanner;

//찾는 key값을 가진 인덱스 값과 갯수를 구하는 알고리즘
public class Problem2 {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int indexNum = scan.nextInt();

        int[] array = new int[indexNum]; // 값을 찾을 배열
        int[] indexArray = new int[indexNum]; // index 넣을 배열

        for (int index = 0; index < indexNum; index++) {
            System.out.print("[" + index + "] = ");
            array[index] = scan.nextInt();
        }

        System.out.print("찾는 값 : ");
        int key = scan.nextInt();

        int indexCount = searchIdx(array, indexNum, key, indexArray);

        System.out.print("찾던 "+ key +"값의 갯수는 "+ indexCount +"이며, 배열의 인덱스는 ");
        for (int index = 0; index < indexCount; index++) {
            System.out.print( indexArray[index] + " ");
        }
        System.out.print("입니다. ");
    }

    //찾기 메소드
    static int searchIdx(int[] array, int indexNum, int key, int[] indexArray) {
        int indexCount = 0;

        for (int i = 0; i < indexNum; i++) {
            if (array[i] == key) {
                indexArray[indexCount] = i;
                indexCount++;
            }
        }

        return indexCount;
    }
}

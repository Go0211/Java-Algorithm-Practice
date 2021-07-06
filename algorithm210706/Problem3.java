package algorithm210706;

import java.util.Scanner;

//이진검색에서 key값 중 가장 앞에 있는 index값 구하는 알고리즘
public class Problem3 {

    static final int NONE = -1;

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int indexNum = scan.nextInt();

        int[] array = new int[indexNum];

        System.out.print("[" + 0 + "]");
        array[0] = scan.nextInt();

        for (int index = 1; index < index; index++) {
            do {
                System.out.print("[" + index + "]");
                array[index] = scan.nextInt();
            } while(array[index] < array[index -1]);
        }

        System.out.print("찾을 값 : ");
        int key = scan.nextInt();

        int result = binSearchX(array, indexNum, key);

        if (result == NONE) {
            System.out.println("false");
        } else {
            System.out.println("배열에서 중복된 key "+ key +"의 맨 앞 요소는 ["+ result +"] 입니다.");
        }
    }

    //이진 검색 + 인덱스값 찾기
    static int binSearchX(int[] array, int indexNum , int key) {
        int indexStart = 0;
        int indexEnd = indexNum -1;
        int indexPoint = (indexStart + indexEnd) / 2;
        int finalValue = indexPoint;

        do {
            if (array[indexPoint] == key) {
                for (int i = indexPoint; i >= 0; i--) {
                    if (key == array[i]) {
                        finalValue = i;
                    }
                }
            } else if (array[indexPoint] > key) {
                indexEnd = indexPoint--;
            } else {
                indexStart = indexPoint++;
            }

            if ((indexPoint == indexEnd || indexPoint == indexStart) && array[indexPoint] != key) {
                finalValue = NONE;
                break;
            }
        } while(array[indexPoint] != key);

        return finalValue;
    }
}

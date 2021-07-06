package algorithm210706;

import java.util.Scanner;

//이진 검색하는 알고리즘
public class ExampleAlgorithm3 {

    static final int NONE = -1;

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int indexNum = scan.nextInt();

        int[] arrayBinarySearch = new int[indexNum];

        System.out.print("x[0] : ");
        arrayBinarySearch[0] = scan.nextInt();

        for (int index = 1; index < indexNum; index++) {
            do {
                System.out.print("x[" + index + "] : ");
                arrayBinarySearch[index] = scan.nextInt();
            } while (arrayBinarySearch[index] < arrayBinarySearch[index - 1]);
        }

        System.out.print("검색할 값 : ");
        int key = scan.nextInt();

        int indexValue = binarySearch(arrayBinarySearch, indexNum, key);

        if (indexValue == NONE) {
            System.out.println("그 값에 요소가 없습니다.");
        } else {
            System.out.println( key + "은(는) x[" + indexValue + "]에 있습니다.");
        }
    }

    //검색하는 메소드
    static int binarySearch(int[] arrayBinarySearch, int indexNum, int key) {
        int indexStart = 0;
        int indexEnd = indexNum - 1;

        do {
            int indexPoint = (indexStart + indexEnd) / 2;

            if (arrayBinarySearch[indexPoint] == key) {
                return indexPoint;
            } else if (arrayBinarySearch[indexPoint] < key) {
                indexStart = indexPoint + 1;
            } else {
                indexEnd = indexPoint - 1;
            }
        } while( indexStart <= indexEnd);

        return NONE;
    }
}

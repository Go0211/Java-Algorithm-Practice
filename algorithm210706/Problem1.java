package algorithm210706;

import java.util.Scanner;

//이진 검색하는 알고리즘(while 대신 for)
public class Problem1 {

    static final int NONE = -1;

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int indexNum = scan.nextInt();
        int[] array = new int[indexNum];

        System.out.print("x[0] : ");
        array[0] = scan.nextInt();

        for (int index = 1; index < indexNum; index++) {
            for (;;){
                System.out.print("x[" + index + "] : ");
                array[index] = scan.nextInt();

                if (!(array[index] < array[index - 1])) {
                    break;
                }
            }
        }

        System.out.print("검색할 값 : ");
        int key = scan.nextInt();

        int indexValue = binSearch(array, indexNum, key);

        if (indexValue == NONE) {
            System.out.println("그 값에 요소가 없습니다.");
        } else {
            System.out.println( key + "은(는) x[" + indexValue + "]에 있습니다.");
        }
    }

    //검색하는 메소드
    static int binSearch(int[] array, int indexNum, int key) {
        int indexStart = 0;
        int indexEnd = indexNum - 1;

        for (;;){
            int indexPoint = (indexStart + indexEnd) / 2;

            if (array[indexPoint] == key) {
                return indexPoint;
            } else if (array[indexPoint] < key) {
                indexStart = indexPoint + 1;
            } else {
                indexEnd = indexPoint - 1;
            }

            if (!(indexStart <= indexEnd)) {
                break;
            }
        }

        return NONE;
    }
}

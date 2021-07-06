package algorithm210706;

import java.util.Scanner;

//선형검색(보초법)
public class ExampleAlgorithm2 {

    static final int NONE = -1;

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("요솟 수 : ");
        int indexNum = scan.nextInt();
        int[] arraySeqSearch = new int[indexNum + 1];

        for (int index = 0; index < indexNum; index++) {
            System.out.print("x[" + index + "] : ");
            arraySeqSearch[index] = scan.nextInt();
        }

        System.out.print("검색할 값 : ");
        int key = scan.nextInt();

        int indexValue = seqSearchSen(arraySeqSearch, indexNum, key);

        if (indexValue == NONE) {
            System.out.println("그 값에 요소가 없습니다.");
        } else {
            System.out.println(key + "은(는) x[" + indexValue + "]에 있습니다.");
        }
    }

    //검색하는 메소드
    static int seqSearchSen(int[] arraySeqSearch, int indexNum, int key) {
        int i = 0;

        arraySeqSearch[indexNum] = key; //보초법(마지막에 key값을 넣는다.)

        while(true) {
            if (arraySeqSearch[i] == key) {
                break;
            }

            i++;
        }

        if (i == indexNum) {
            return NONE;
        } else {
            return i;
        }
    }
}

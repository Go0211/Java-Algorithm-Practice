package algorithm210706;

import java.util.Scanner;

//선형검색하는 알고리즘
public class ExampleAlgorithm1 {

    static final int NONE = -1;

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("요솟 수 : ");
        int indexNum = scan.nextInt();

        int[] arraySeqSearch = new int[indexNum];

        for (int index = 0; index < indexNum; index++) {
            System.out.print("x[" + index + "] : ");
            arraySeqSearch[index] = scan.nextInt();
        }

        System.out.print("검색할 값 : ");
        int key = scan.nextInt();

        int indexValue = seqSearchWhile(arraySeqSearch, indexNum, key);

        if (indexValue == NONE) {
            System.out.println("그 값에 요소가 없습니다.");
        } else {
            System.out.println(key + "은(는) x[" + indexValue + "]에 있습니다.");
        }
    }

    //선형 검색하는 메소드(While문)
    static int seqSearchWhile(int[] arrayLine, int indexNum, int key) {
        int i = 0;

        while(true) {
            if (i == indexNum) {
                return NONE;
            }
            if (arrayLine[i] == key) {
                return i;
            }

            i++;
        }
    }

    //선형 검색하는 메소드(For문)
    static int seqSearchFor(int[] arrayLine, int indexNum, int key) {
        for (int i = 0; i < indexNum; i++) {
            if (arrayLine[i] == key) {
                return i; 
            }
        }
        
        return NONE;
    }
}

package algorithm210706;

import java.util.Arrays;
import java.util.Scanner;

//이진 검색 (binarySearch 활용)
public class ExampleAlgorithm4 {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int indexNum = scan.nextInt();

        int[] arraySearch = new int[indexNum]; // 값을 찾을 배열

        for (int index = 0; index < indexNum; index++) {
            System.out.print("[" + index + "] = ");
            arraySearch[index] = scan.nextInt();
        }

        System.out.print("찾는 값 : ");
        int key = scan.nextInt();

        int indexValue = Arrays.binarySearch(arraySearch, key);

       if (indexValue < 0) {
           System.out.println("no");
       } else {
           System.out.println( key + "은(는) [" + indexValue + "]에 있습니다.");
       }
    }
}

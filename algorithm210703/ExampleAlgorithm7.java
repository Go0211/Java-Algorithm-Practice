package algorithm210703;

import java.util.Scanner;

//두 배열이 같은 지 판단
public class ExampleAlgorithm7 {
    static Scanner scan = new Scanner(System.in);

    //메인
    public static void main(String[] args) {
        System.out.print("첫 번째 원하는 배열의 크기를 정해주세요 : ");
        int arraySizeOne = scan.nextInt();
        int[] arrayOne = insertArrayElement(arraySizeOne);

        System.out.print("두 번째 원하는 배열의 크기를 정해주세요 : ");
        int arraySizeTwo = scan.nextInt();
        int[] arrayTwo = insertArrayElement(arraySizeTwo);

        boolean equalCheck = arrayEqualJudgement(arrayOne, arrayTwo);

        if (equalCheck == true) {
            System.out.println("두 배열은 같습니다");
        } else {
            System.out.println("두 배열은 같지 않습니다.");
        }
    }

    //두 배열요소의 값이 같은 지 여부 확인
    static boolean arrayEqualJudgement(int[] a, int b[]) {
        boolean equalCheck = true;

        if (a.length != b.length) {
            equalCheck = false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    equalCheck = false;
                }
            }
        }

        return equalCheck;
    }

    //배열에 요소 삽입
    static int[] insertArrayElement(int a) {
        int[] result = new int[a];

        for (int imsiNum = 0; imsiNum < result.length; imsiNum++) {
            System.out.print((imsiNum+1) + "번째의 요소 값을 입력해주세요 : ");
            result[imsiNum] = scan.nextInt();
        }

        return result;
    }
}

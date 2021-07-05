package algorithm210704;

import java.util.Scanner;

//기수 변환을 하는 알고리즘 구현
public class ExampleAlgorithm1 {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dNum, changeNum, index, retry;
        char[] changeDNum = new char[32];

        System.out.println("10진수를 기수 변환합니다.");

        do {
            do {
                System.out.print("변환하는 음이 아닌 정수");
                dNum = scan.nextInt();
            } while(dNum < 0);

            do {
                System.out.print("변환하고 싶은 진수 (2~36) : ");
                changeNum = scan.nextInt();
            } while(changeNum < 2 || changeNum > 36);

            index = cardConvR(dNum, changeNum, changeDNum);

            System.out.print(changeNum + "진수로는 ");
            for (int i = index - 1; i >= 0; i--) {
                System.out.print(changeDNum[i]);
            }
            System.out.print("입니다.");

            System.out.print("한번 더 (1. 예 / 0. 아니요)");
            retry = scan.nextInt();
        } while (retry == 1);
    }

    //주어진 값을 주어진 진수로 기수변환
    static int cardConvR(int dNum, int changeNum, char[] changeDNum) {
        int count = 0;
        String dChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            changeDNum[count++] = dChar.charAt(dNum % changeNum);
            dNum /= changeNum;
        } while (dNum != 0);

        return count;
    }
}

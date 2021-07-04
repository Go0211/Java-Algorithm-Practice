package algorithm210704;

import java.util.Scanner;

//기수 변환을 하는 알고리즘 구현
public class ExampleAlgorithm1 {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int no, cd, dno, retry;
        char[] cno = new char[32];

        System.out.println("10진수를 기수 변환합니다.");

        do {
            do {
                System.out.print("변환하는 음이 아닌 정수");
                no = scan.nextInt();
            } while(no < 0);

            do {
                System.out.print("변환하고 싶은 진수 (2~36) : ");
                cd = scan.nextInt();
            } while(cd < 2 || cd > 36);

            dno = cardConvR(no, cd, cno);

            System.out.print(cd + "진수로는 ");
            for (int i = dno - 1; i >= 0; i--) {
                System.out.print(cno[i]);
            }
            System.out.print("입니다.");


            System.out.print("한번 더 (1. 예 / 0. 아니요)");
            retry = scan.nextInt();
        } while (retry == 1);
    }

    //주어진 값을 주어진 진수로 기수변환
    static int cardConvR(int x, int r, char[] d) {
        int digits = 0;
        String dChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dChar.charAt(x % r);
            x /= r;
        } while (x != 0);

        return digits;
    }
}

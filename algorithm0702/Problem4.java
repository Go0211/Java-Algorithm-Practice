package algorithm0702;

import java.util.Scanner;

//Scanner로 정수 3개를 입력받고 중앙값을 찾아내는 알고리즘 구현
//If. 같은 값을 입력하는 경우 다시 한 번더 입력받음
public class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firNumber, secNumber, thiNumber;

        do {
            System.out.println("정수 3개를 넣어주세요");
            System.out.println("※같은 값을 넣을 시 다시 입력해야 합니다.");
            System.out.print("first : ");
            firNumber = scan.nextInt();
            System.out.print("second : ");
            secNumber = scan.nextInt();
            System.out.print("third : ");
            thiNumber = scan.nextInt();
        } while ((firNumber == secNumber) || (firNumber == thiNumber) || (thiNumber == secNumber));

        int medNumber = findMedNumber(firNumber, secNumber, thiNumber);

        System.out.println("중앙값은 " + medNumber + "입니다");
    }

    static int findMedNumber(int firNUmber, int secNumber, int thiNumber) {
        int medNumber = firNUmber;

        if (firNUmber > secNumber) {
            if (firNUmber > thiNumber) {
                if (secNumber > thiNumber) {
                    medNumber = secNumber;
                } else {
                    medNumber = thiNumber;
                }
            }
        } else {
            if (firNUmber > thiNumber) {
                medNumber = firNUmber;
            } else {
                if (secNumber > thiNumber) {
                    medNumber = thiNumber;
                } else {
                    medNumber = secNumber;
                }
            }
        }

        return medNumber;
    }
}

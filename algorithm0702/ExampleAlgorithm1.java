package algorithm0702;

import java.util.Scanner;

// 정수값 3개를 받고 이 값들의 최대값을 구하는 알고리즘 구현
public class ExampleAlgorithm1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firNumber, secNumber, thiNumber;

        System.out.println("정수값 세 개를 선언해주세요 :  ");

        System.out.print("first : ");
        firNumber = scan.nextInt();
        System.out.print("second : ");
        secNumber = scan.nextInt();
        System.out.print("third : ");
        thiNumber = scan.nextInt();

        int maxNumber = firNumber;

        if (secNumber > maxNumber) {
            maxNumber = secNumber;
        }
        if (thiNumber > maxNumber) {
            maxNumber = thiNumber;
        }

        System.out.println("최대값은" + maxNumber + "입니다.");
    }
}

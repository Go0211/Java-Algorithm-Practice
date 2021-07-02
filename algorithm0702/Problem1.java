package algorithm0702;

import java.util.Scanner;

//Scanner로 4개의 값을 받고 최대값을 구하는 알고리즘 구현
public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firNumber, secNumber, thiNumber, fouNumber;

        System.out.println("정수 4개를 넣어주세요");
        System.out.print("first : ");
        firNumber = scan.nextInt();
        System.out.print("second : ");
        secNumber = scan.nextInt();
        System.out.print("third : ");
        thiNumber = scan.nextInt();
        System.out.print("fourth : ");
        fouNumber = scan.nextInt();

        int maxNumber = findMaxNumber(firNumber, secNumber, thiNumber, fouNumber);

        System.out.println("최댓값은 " + maxNumber + "입니다");
    }

    static int findMaxNumber(int firNumber, int secNumber, int thiNumber, int fouNumber) {
        int maxNumber = firNumber;

        if (secNumber > maxNumber) {
            maxNumber = secNumber;
        }
        if (thiNumber > maxNumber) {
            maxNumber = thiNumber;
        }
        if (fouNumber > maxNumber) {
            maxNumber = fouNumber;
        }

        return maxNumber;
    }
}

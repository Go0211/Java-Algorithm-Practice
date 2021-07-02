package algorithm0702;

import java.util.Scanner;


//Scanner로 정수 4개를 입력받고 최솟값을 찾아내는 알고리즘 구현
public class Problem3 {
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

        int minNumber = findMinNumber(firNumber, secNumber, thiNumber, fouNumber);

        System.out.println("최솟값은 " + minNumber + "입니다");
    }

    static int findMinNumber(int firNumber, int secNumber, int thiNumber, int fouNumber) {
        int minNumber = firNumber;

        if (secNumber < minNumber) {
            minNumber = secNumber;
        }
        if (thiNumber < minNumber) {
            minNumber = thiNumber;
        }
        if (fouNumber < minNumber) {
            minNumber = fouNumber;
        }

        return minNumber;
    }
}

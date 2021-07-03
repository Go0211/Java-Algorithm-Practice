package algorithm210702;

import java.util.Scanner;

//입력한 만큼의 변을 가진 이등변 삼각형 구현 (LB, LU, RB, RU)
public class Problem13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 넣어주세요 : ");
        int sideNumber = scan.nextInt();

        triangleLB(sideNumber);
        triangleLU(sideNumber);
        triangleRB(sideNumber);
        triangleRU(sideNumber);
    }

    static void triangleLB(int sideNumber) {
        int count = 1;

        for (int firImsiNumber = 1; firImsiNumber <= sideNumber; firImsiNumber++) {
            System.out.println();
            for (int secImsiNumber = 1; secImsiNumber <= count; secImsiNumber++) {
                System.out.print("*");
            }
            count++;
        }
    }

    static void triangleLU(int sideNumber) {
        int count = sideNumber;

        for (int firImsiNumber = 1; firImsiNumber <= sideNumber; firImsiNumber++) {
            System.out.println();
            for (int secImsiNumber = 1; secImsiNumber <= count; secImsiNumber++) {
                System.out.print("*");
            }
            count--;
        }
    }

    static void triangleRU(int sideNumber) {
        int count = sideNumber;

        for (int firImsiNumber = 1; firImsiNumber <= sideNumber; firImsiNumber++) {
            System.out.println();

            if (!(count == sideNumber)) {
                for (int secImsiNumber = 1; secImsiNumber <= (sideNumber-count); secImsiNumber++) {
                    System.out.print(" ");
                }
            }

            for (int thiImsiNumber = 1; thiImsiNumber <= count; thiImsiNumber++) {
                System.out.print("*");
            }
            count--;
        }
    }

    static void triangleRB(int sideNumber) {
        int count = 1;

        for (int firImsiNumber = 1; firImsiNumber <= sideNumber; firImsiNumber++) {
            System.out.println();

            if (!(count == sideNumber)) {
                for (int secImsiNumber = 1; secImsiNumber <= (sideNumber - count); secImsiNumber++) {
                    System.out.print(" ");
                }
            }

            for (int thiImsiNumber = 1; thiImsiNumber <= count; thiImsiNumber++) {
                System.out.print("*");
            }
            count++;
        }
    }
}

package algorithm0702;

import java.util.Scanner;

//입력한 정수의 변을 가진 정사각형
public class Problem12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("사각형의 단수를 정해주세요 : ");
        int sideNumber = scan.nextInt();

        for (int firImsiNumber = 1; firImsiNumber <= sideNumber; firImsiNumber++) {
            System.out.println();

            for (int secImsiNumber = 1; secImsiNumber <= sideNumber; secImsiNumber++) {
                System.out.print("*");
            }
        }
    }
}

package algorithm210702;

import java.util.Scanner;

//Scanner로 정수 n을 받고 1부터 n만큼 정수값을 더하는 알고리즘 구현
public class Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("정수 넣어주세요");
        System.out.print("정수 : ");
        int finalNumber = scan.nextInt();

        int totalNumber = 0;

        for (int i = 1; i <= finalNumber; i++) {
            totalNumber += i;
        }

        System.out.println("1부터 " + finalNumber + "을 더한 값은 " + totalNumber + "입니다");
    }
}

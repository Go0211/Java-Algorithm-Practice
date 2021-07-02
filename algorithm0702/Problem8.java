package algorithm0702;

import java.util.Scanner;

//Scanner로 두 정수를 받고 정수끼리 뺄셈진행
//※첫 수보다 두 번째 수가 작으면 다시 진행
public class Problem8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firNumber, secNumber;

        System.out.println("정수 2개 넣어주세요");
        System.out.print("첫 번째 정수 : ");
        firNumber = scan.nextInt();

        do {
            System.out.print("두 번째 정수 : ");
            secNumber = scan.nextInt();

            if (secNumber <= firNumber) {
                System.out.println(firNumber + "보다 큰 정수를 넣어주세요.");
            }
        } while (!(firNumber < secNumber));

        System.out.println(secNumber + " - " + firNumber + " = " + (secNumber-firNumber));
    }
}

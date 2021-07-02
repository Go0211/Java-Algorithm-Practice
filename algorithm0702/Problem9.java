package algorithm0702;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 넣어주세요 : ");
        int firNumber = scan.nextInt();

        int countNumber = 1;
        int firNumberCopy = firNumber;

        do {
            firNumberCopy = firNumberCopy/10;
            countNumber++;
        } while (!(firNumber < 10));

        System.out.println("입력한 정수 " + firNumber + "의 자릿수는 " + countNumber + "입니다.");
    }
}

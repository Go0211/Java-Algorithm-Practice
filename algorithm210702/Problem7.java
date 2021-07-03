package algorithm210702;

import java.util.Scanner;

//Scanner로 정수 2개를 받은 후 작은 정수부터 큰 정수까지 더하는 알고리즘 구성
public class Problem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("정수 2개 넣어주세요");
        System.out.print("첫 번째 정수 : ");
        int firNumber = scan.nextInt();
        System.out.print("두 번째 정수 : ");
        int secNumber = scan.nextInt();

        int totalNumber = sumAToB(firNumber, secNumber);

        if (firNumber > secNumber) {
            System.out.println(secNumber + "부터 " + firNumber + "을 더한 값은 " + totalNumber + "입니다");
        } else if (secNumber > firNumber) {
            System.out.println(firNumber + "부터 " + secNumber + "을 더한 값은 " + totalNumber + "입니다");
        } else {
            System.out.println("입력한 값이 동일합니다.");
        }
    }

    static int sumAToB(int firNumber, int secNumber) {
        int totalNumber = 0;

        if (firNumber > secNumber) {
            for (int imsiNumber = secNumber; imsiNumber <= firNumber; imsiNumber++) {
                totalNumber += imsiNumber;
            }
        } else if (secNumber > firNumber) {
            for (int imsiNumber = firNumber; imsiNumber <= secNumber; imsiNumber++) {
                totalNumber += imsiNumber;
            }
        }

        return totalNumber;
    }
}

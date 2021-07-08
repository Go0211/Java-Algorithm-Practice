package algorithm210708;

import java.util.Scanner;

//팩토리얼 구하기 (재귀 없이)
public class Problem2 {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("팩토리얼 하기 원하는 수 : ");
        int factorial = scan.nextInt();

        System.out.println(factorial + "팩토리얼의 값은 " + factorialOne(factorial) + "입니다.");
    }

    //팩토리얼 메서드 (반복문)
    private static int factorialOne(int factorialNum) {
        for (int i = factorialNum - 1; i > 0; i --) {
            factorialNum *= i;
        }

        return factorialNum;
    }
    
    //팩토리얼 메서드 (직접 재귀)
    private static int factorialTwo(int factorialNum) {
        if (factorialNum > 0) {
            return factorialNum * factorialTwo(factorialNum - 1);
        } else {
            return 1;
        }
    }
}

package algorithm210708;

import java.util.Scanner;

//두 정수의 최대공약수를 구하는 알고리즘
public class Problem3 {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("최대 공약수를 찾을 두 정수 : ");
        System.out.print("1. ");
        int one = scan.nextInt();
        System.out.print("2. ");
        int two = scan.nextInt();

        System.out.println("두 정수의 최대 공약수는 " + gcdOne(one, two) + "입니다.");

        System.out.print("최대 공약수를 찾을 배열의 길이 : ");
        System.out.print("길이 ");
        int max = scan.nextInt();

        int[] array = new int[max];

        for (int i = 0; i < max; i ++) {
            System.out.print("[" + i + "]");
            array[i] = scan.nextInt();
        }

        System.out.println("배열 요소들의 최대 공약수는 " + gcdArray(array) + "입니다.");
    }

    //gcd재귀없는 버전
    private static int gcdOne(int one, int two) {
        int point;
        int result = 0;

        if (one > two) {
            point = two;
        } else {
            point = one;
        }

        for (int i = 1; i < point; i++) {
            if (one % i == 0 && two % i == 0) {
                result = i;
            }
        }

        return result;
    }

    //gcd재귀 버전
    private static int gcdTwo(int one, int two) {
        if (two == 0) {
            return one;
        } else {
            return gcdTwo(two, one % two);
        }
    }

    //배열 모든 요소들의 최대 공약수
    private static int gcdArray(int[] array) {
        int stand = array[0];
        int count = 0;
        int result = 0;

        for (int i = 1; i < array.length; i++) {
            if (stand > array[i]) {
                stand = array[i];
            }
        }

        for (int i = 1; i <= stand; i++) {
            for (int y = 0; y < array.length; y++) {
                if (array[y] % i == 0) {
                    count++;
                }
            }

            if (count == array.length) {
                result = i;
            }

            count = 0;
        }

        return result;
    }
}

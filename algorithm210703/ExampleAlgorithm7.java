package algorithm210703;

import java.util.Scanner;

//두 배열이 같은 지 판단
public class ExampleAlgorithm7 {
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.print("첫 번째 원하는 배열의 크기를 정해주세요 : ");
        int a = scan.nextInt();
        int[] aa = insertArrayElement(a);

        System.out.print("두 번째 원하는 배열의 크기를 정해주세요 : ");
        int b = scan.nextInt();
        int[] bb = insertArrayElement(b);

        boolean c = arrayEqualJudgement(aa, bb);

        if (c == true) {
            System.out.println("두 배열은 같습니다");
        } else {
            System.out.println("두 배열은 같지 않습니다.");
        }
    }

    static boolean arrayEqualJudgement(int[] a, int b[]) {
        boolean check = true;

        if (a.length != b.length) {
            check = false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    check = false;
                }
            }
        }

        return check;
    }

    static int[] insertArrayElement(int a) {
        int[] result = new int[a];

        for (int i = 0; i < result.length; i++) {
            System.out.print((i+1) + "번째의 요소 값을 입력해주세요 : ");
            result[i] = scan.nextInt();
        }

        return result;
    }
}

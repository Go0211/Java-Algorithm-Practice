package algorithm210703;

import java.util.Scanner;

//b배열의 요소들을 a배열에 역순으로 복사
public class Problem5 {
    static Scanner scan = new Scanner(System.in);

    //메인
    public static void main(String[] args) {
        System.out.print("첫 번째 원하는 배열의 크기를 정해주세요 : ");
        int a = scan.nextInt();
        int[] aa = insertArrayElement(a);

        System.out.print("두 번째 원하는 배열의 크기를 정해주세요 : ");
        int b = scan.nextInt();
        int[] bb = insertArrayElement(b);

        rcopy(aa, bb);

        System.out.println("완료했습니다");
        for (int i = 0; i < aa.length; i++) {
            System.out.print(aa[i]);
        }
        System.out.println();

        for (int i = 0; i < bb.length; i++) {
            System.out.print(bb[i]);
        }
    }

    //b배열를 a배열에 복사
    static void rcopy(int[] a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            a[i] = b[b.length - (i+1)];
        }
    }

    //배열안 요소에 값 넣기
    static int[] insertArrayElement(int a) {
        int[] result = new int[a];

        for (int i = 0; i < result.length; i++) {
            System.out.print((i+1) + "번째의 요소 값을 입력해주세요 : ");
            result[i] = scan.nextInt();
        }

        return result;
    }
}

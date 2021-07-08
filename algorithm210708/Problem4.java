package algorithm210708;

import java.util.Scanner;

//하노이의 탑 비 재귀
public class Problem4 {
    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반 갯 수 ");
        int n = scan.nextInt();

        move(n, 1, 3);
    }

    //하노이 탑
    private static void move(int no, int x, int y) {

    }
}

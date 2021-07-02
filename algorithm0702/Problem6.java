package algorithm0702;

import java.util.Scanner;

//가우스의 덧셈을 사용하는 알고리즘 구현
public class Problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("정수 1개 넣어주세요");
        System.out.print("정수 : ");
        int number = scan.nextInt();

        int totalNumber = number*(number+1)/2;

        System.out.println("1부터 " + number + "을 더한 값은 " + totalNumber + "입니다");
    }
}

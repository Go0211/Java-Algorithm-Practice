package algorithm210726;

import java.util.Scanner;
import java.util.Stack;

//스택 사용법
public class UseStack {

    //메인
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);

        System.out.print("스택에 넣을 값의 갯수 : ");
        int size = scan.nextInt();

        for(int i = 0; i < size; i++ ) {
            stack.push(i);
        }

        for(int i = 0; i < size; i++ ) {
            System.out.print(stack.search(i) + " ");
        }

        System.out.println();

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.empty());
    }
}

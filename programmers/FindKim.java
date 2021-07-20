package programmers;

import java.util.Scanner;

//Kim서방 찾기
public class FindKim {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열의 크기 : ");
        int num = scan.nextInt();

        String[] array = new String[num];

        for (int i = 0; i < num; i++) {
            System.out.print(i + " : ");
            array[i] = scan.next();
        }

        System.out.println(solution(array));
    }

    //문제
    private static String solution(String[] seoul) {
        String answer = "";

        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }

        return answer;
    }
}

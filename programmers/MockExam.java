package programmers;

import java.util.Scanner;

//문제를 찍은 사람 중 가장 많이 맞은 사람을 찾는 문제
public class MockExam {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("문제 수 : ");
        int problemSize = scan.nextInt();

        int[] answer = new int[problemSize];

        for(int i = 0; i < answer.length; i++) {
            System.out.print(i + " : ");
            answer[i] = scan.nextInt();
        }

        for(int i = 0; i < solution(answer).length; i++) {
            System.out.print(solution(answer)[i] + " ");
        }
    }

    //문제
    private static int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thr = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int a, b ,c;
        a = b = c = 0;

        for(int i = 0; i < answers.length; i++) {
            if(one[i % 5] == answers[i]) {
                a++;
            }

            if(two[i % 8] == answers[i]) {
                b++;
            }

            if(thr[i % 10] == answers[i]) {
                c++;
            }
        }

        if(a > b) {
            if(a > c) {
                int[] answer = {1};
                return answer;
            } else if (a < c){
                int[] answer = {3};
                return answer;
            } else {
                int[] answer = {1, 3};
                return answer;
            }
        } else if(b > a){
            if(b > c) {
                int[] answer = {2};
                return answer;
            } else if (b < c){
                int[] answer = {3};
                return answer;
            } else {
                int[] answer = {2, 3};
                return answer;
            }
        } else {
            if(a > c) {
                int[] answer = {1, 2};
                return answer;
            } else if (a < c){
                int[] answer = {3};
                return answer;
            } else {
                int[] answer = {1, 2, 3};
                return answer;
            }
        }
    }
}

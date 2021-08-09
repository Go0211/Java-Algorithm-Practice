package programmers;

import java.util.PriorityQueue;
import java.util.Scanner;

//스코빌을 k이상으로 만드는 수
public class ScovilleScale {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열의 크기 : ");
        int size = scan.nextInt();

        int[] scoville = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.print(i + " : ");
            scoville[i] = scan.nextInt();
        }

        System.out.print("수 : ");
        int k = scan.nextInt();

        System.out.println("다 " + k + " 이상 일 최소한의 경우의 수 : " + solution(scoville, k));
    }

    //문제
    private static int solution(int[] scoville, int K) {
        int a, b;
        int answer = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i = 0; i < scoville.length; i++) {
            heap.add(scoville[i]);
        }

        while(true) {
            if(heap.peek() < K) {
                int tmp = heap.poll();

                if(heap.peek() == null) {
                    return -1;
                } else {
                    heap.add(tmp);

                    a = heap.poll();
                    b = heap.poll();

                    heap.add(a + (b * 2));

                    answer++;
                }
            } else {
                break;
            }
        }

        return answer;
    }
}

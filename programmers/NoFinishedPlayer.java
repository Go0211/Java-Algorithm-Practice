package programmers;

import java.util.HashMap;
import java.util.Scanner;

//완주못한 사람
public class NoFinishedPlayer {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("참여인원 :");
        int participant = scan.nextInt();

        String[] participantArray = new String[participant];

        for(int i = 0; i < participant; i++) {
            System.out.print(i + " : ");
            participantArray[i] = scan.next();
        }

        System.out.println("완주자 :");
        String[] completionArray = new String[participant - 1];

        for(int i = 0; i < participant - 1; i++) {
            System.out.print(i + " : ");
            completionArray[i] = scan.next();
        }

        System.out.println("완주못한 사람 : " + solution(participantArray, completionArray));
    }

    //문제
    private static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < completion.length; i++) {
            if(map.containsKey(completion[i]) == true) {
                map.put(completion[i], map.get(completion[i]) + 1);
            } else {
                map.put(completion[i], 1);
            }


        }

        for(int i = 0; i < participant.length; i++) {
            if(map.containsKey(participant[i]) == false) {
                answer = participant[i];
            } else {
                if(map.get(participant[i]) > 1) {
                    map.put(participant[i], map.get(participant[i]) - 1);
                } else {
                    map.remove(participant[i]);
                }
            }
        }

        return answer;
    }
}

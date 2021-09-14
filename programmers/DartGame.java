package programmers;

import java.util.ArrayList;

//타트게임
public class DartGame {
    //메인 - 확인하기
    public static void main(String[] args) {
        if(solution("1S2D*3T") == 37) {
            System.out.print("0");
        } else {
            System.out.print("x");
        }
        if(solution("1D2S#10S") == 9) {
            System.out.print("0");
        } else {
            System.out.print("x");
        }
        if(solution("1D2S0T") == 3) {
            System.out.print("0");
        } else {
            System.out.print("x");
        }
        if(solution("1S*2T*3S") == 23) {
            System.out.print("0");
        } else {
            System.out.print("x");
        }
        if(solution("1D#2S*3S") == 5) {
            System.out.print("0");
        } else {
            System.out.print("x");
        }
        if(solution("1T2D3D#") == -4) {
            System.out.print("0");
        } else {
            System.out.print("x");
        }
        if(solution("1D2S3T*") == 59) {
            System.out.print("0");
        } else {
            System.out.print("x");
        }
    }

    //문제
    private static int solution(String dartResult) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();   //값 저장소
        String[] value = dartResult.split("");

        for(int i = 0; i < value.length; i++) {
            if(value[i].equals("D")) {
                list.set(list.size() - 1, (int)Math.pow(list.get(list.size() - 1), 2));
            } else if(value[i].equals("T")) {
                list.set(list.size() - 1, (int)Math.pow(list.get(list.size() - 1), 3));
            } else if(value[i].equals("*")) {
                list.set(list.size() - 1, list.get(list.size() - 1) * 2);

                if(list.size() != 1) {
                    list.set(list.size() - 2, list.get(list.size() - 2) * 2);
                }
            } else if(value[i].equals("#")){
                list.set(list.size() - 1, -(list.get(list.size() - 1)));
            } else if(!value[i].equals("S")){
                if(value[i].equals("1")
                        && value[i + 1].equals("0")) {
                    list.add(10);
                    i++;
                } else {
                    list.add(Integer.parseInt(value[i]));
                }
            }
        }

        for(int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }

        return answer;
    }
}

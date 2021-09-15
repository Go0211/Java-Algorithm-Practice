package programmers;

import java.util.Arrays;

//4주차 - 직업군 추천하기
public class JobRecommend {
    //메인 - 확인하기
    public static void main(String[] args) {
        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#"
                , "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++"
                , "HARDWARE C C++ PYTHON JAVA JAVASCRIPT"
                , "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP"
                , "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] languages1 = {"PYTHON", "C++", "SQL"};
        int[] preference1 = {7, 5, 5};
        if(solution(table, languages1, preference1).equals("HARDWARE")) {
            System.out.print("0");
        } else {
            System.out.print("x");
        }

        String[] languages2 = {"JAVA", "JAVASCRIPT"};
        int[] preference2 = {7, 5};
        if(solution(table, languages2, preference2).equals("PORTAL")) {
            System.out.print("0");
        } else {
            System.out.print("x");
        }
    }

    //문제
    private static String solution(String[] table, String[] languages, int[] preference) {
        String[][] value = new String[5][6];
        int[] scores = new int[languages.length];
        int index, answerChecker, answerValue;
        index = answerChecker = answerValue = 0;

        // 정렬로 서순을 맞춘다. (순서대로 값 비교 후 같으면 유지)
        Arrays.sort(table);

        // split으로 나눈다.(" ")
        for(int i = 0; i < value.length; i++) {
            value[i] = table[i].split(" ");
        }

        //전체적인 반복
        for(int x = 0; x < value.length; x++) {
            //언어
            for(int y = 0; y < languages.length; y++) {
                //순위
                for(int z = 1; z < value[x].length; z++) {
                    if(languages[y].equals(value[x][z])) {
                        scores[y] = preference[y] * (value[x].length - z);
                        break;
                    }
                }
            }

            for(int i = 0; i < scores.length; i++) {
                answerValue += scores[i];
                scores[i] = 0;
            }

            if(answerChecker < answerValue) {
                answerChecker = answerValue;
                index = x;
            }

            answerValue = 0;
        }

        String answer = value[index][0];
        return answer;
    }
}

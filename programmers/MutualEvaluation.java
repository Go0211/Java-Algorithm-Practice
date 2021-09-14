package programmers;

//2주차_상호평가
public class MutualEvaluation {
    //메인 - 결과 확인
    public static void main(String[] args) {
        int[][] example1 = {{100, 90, 98, 88, 65},
                {50, 45, 99, 85, 77},
                {47, 88, 95, 80, 67},
                {61, 57, 100, 80, 65},
                {24, 90, 94, 75, 65}};
        int[][] example2 = {{50, 90}, {50, 87}};
        int[][] example3 = {{70, 49, 90}, {68, 50, 38}, {73, 31, 100}};

        if(solution(example1).equals("FBABD")) {
            System.out.print("0");
        } else {
            System.out.print("x");
        }
        if(solution(example2).equals("DA")) {
            System.out.print("0");
        } else {
            System.out.print("x");
        }
        if(solution(example3).equals("CFD")) {
            System.out.print("0");
        } else {
            System.out.print("x");
        }
    }

    //문제
    private static String solution(int[][] scores) {
        String answer = "";
        int max, min, average = 0;
        boolean check = true;

        for(int i = 0; i < scores.length; i++) {
            max = min = scores[i][i];
            check = true;

            for(int j = 0; j < scores.length; j++) {
                if(max < scores[j][i]) {
                    max = scores[j][i];
                } else if(min > scores[j][i]) {
                    min = scores[j][i];
                }

                if(i != j) {
                    if(scores[j][i] == scores[i][i]) {
                        check = false;
                    }
                }
            }

            if((scores[i][i] == max || scores[i][i] == min) && check == true) {
                scores[i][i] = 0;
            }

            for(int z = 0; z < scores.length; z++) {
                average += scores[z][i];
            }

            if(scores[i][i] == 0) {
                if(average / (scores.length - 1) >= 90) {
                    answer += "A";
                } else if(average / (scores.length - 1) >= 80) {
                    answer += "B";
                } else if(average / (scores.length - 1) >= 70) {
                    answer += "C";
                } else if(average / (scores.length - 1) >= 50) {
                    answer += "D";
                } else {
                    answer += "F";
                }
            } else {
                if(average / scores.length >= 90) {
                    answer += "A";
                } else if(average / scores.length >= 80) {
                    answer += "B";
                } else if(average / scores.length >= 70) {
                    answer += "C";
                } else if(average / scores.length >= 50) {
                    answer += "D";
                } else {
                    answer += "F";
                }
            }

            average = 0;
        }

        return answer;
    }
}

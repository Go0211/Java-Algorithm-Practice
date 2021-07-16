package algorithm210716;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//브루트-포스법
public class ExampleAlgorithm1 {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("텍스트 : ");
        String s1 = scan.next();

        System.out.print("패턴 : ");
        String s2 = scan.next();

        int idx = bfMatch(s1, s2);

        if (idx == -1) {
            System.out.println("패턴 x");
        } else {
            int len = 0;

            for (int i = 0; i < idx; i++) {
                len += s1.substring(i, i + 1).getBytes().length;
            }

            len += s2.length();

            System.out.println((idx + 1) + "번째 문자부터 일치합니다.");
            System.out.println("텍스트 : " + s1);
            System.out.printf(String.format("패턴 : %%%ds\n", len), s2);
        }
    }

    static int bfMatch(String txt, String pat) {
        int pt = 0;
        int pp = 0;

        while (pt != txt.length() && pp != pat.length()) {
            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt++;
                pp++;
            } else {
                pt = pt - pp + 1;
                pp = 0;
            }
        }

        if(pp == pat.length()) {
            return pt - pp;
        }

        return -1;
    }
}

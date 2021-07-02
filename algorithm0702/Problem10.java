package algorithm0702;

import java.util.Scanner;

//구구단 만들기
public class Problem10 {
    public static void main(String[] args) {
        System.out.print("  |");

        for (int firImsiNumber = 1; firImsiNumber < 9; firImsiNumber++) {
            System.out.print((firImsiNumber) + " ");
        }

        System.out.println();
        System.out.print("---+------------------");

        for (int secImsiNumber = 1; secImsiNumber <= 9; secImsiNumber++) {
            System.out.println();
            System.out.print((secImsiNumber) + "|");

            for (int thiImsiNumber = 1; thiImsiNumber <= 9; thiImsiNumber++) {
                System.out.print((secImsiNumber *thiImsiNumber) + " ");
            }
        }
    }
}

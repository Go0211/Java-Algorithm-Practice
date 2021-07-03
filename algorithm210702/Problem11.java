package algorithm210702;

//곱셈 대신 덧셈으로 구성
public class Problem11 {
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
                System.out.print((secImsiNumber+thiImsiNumber) + " ");
            }
        }
    }
}

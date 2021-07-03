package algorithm210702;

import java.util.Scanner;

//입력한 정수만큼의 단을 가진 별로된 피라미드
public class Problem14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 넣어주세요 : ");
        int floorNumber = scan.nextInt();

        spira(floorNumber);
    }

    static void spira(int floorNumber) {
        int starCountNumber = 1;
        int floorNumberCopy = floorNumber;

        for (int i = 0; i < floorNumber; i++) {
            for (int firImsiNumber = floorNumberCopy; 0 < firImsiNumber; firImsiNumber--) {
                System.out.print(" ");
            }
            for (int secImsiNumber = 0; secImsiNumber < starCountNumber; secImsiNumber++) {
                System.out.print("*");
            }
            for (int thiImsiNumber = floorNumberCopy; 0 < thiImsiNumber; thiImsiNumber--) {
                System.out.print(" ");
            }
            System.out.println();
            starCountNumber += 2;
            floorNumberCopy--;
        }
    }
}

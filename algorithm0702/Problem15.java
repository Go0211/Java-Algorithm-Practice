package algorithm0702;

import java.util.Scanner;

//입력한 정수만큼의 단을 가진 1부터 증가하는 정수로 표현된 피라미드
//※ i행에 표현하는 숫자는 i%10로 구한다.
public class Problem15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 넣어주세요 : ");
        int floorNumber = scan.nextInt();

        npira(floorNumber);
    }

    static void npira(int floorNumber) {
        int starCount = 1;
        int floorNumberCopy = floorNumber;

        for (int totalImsi = 1; totalImsi <= floorNumber; totalImsi++) {
            for (int firImsi = floorNumberCopy; 0 < firImsi; firImsi--) {
                System.out.print(" ");
            }
            for (int secImsi = 0; secImsi < starCount; secImsi++) {
                System.out.print(totalImsi%10);
            }
            for (int thiImsi = floorNumberCopy; 0 < thiImsi; thiImsi--) {
                System.out.print(" ");
            }
            System.out.println();
            starCount += 2;
            floorNumberCopy--;
        }
    }
}

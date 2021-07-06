package algorithm210706;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//이진 검색 (제네릭 binarySearch)
public class ExampleAlgorithm5 {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PhyscData[] arrayPhyscData = {
                new PhyscData("장원영", 162, 0.3),
                new PhyscData("안유진", 163, 0.9),
                new PhyscData("조유리", 164, 1.3),
                new PhyscData("김민주", 165, 0.3),
                new PhyscData("토미", 166, 1.2),
                new PhyscData("나코", 167, 0.2),
                new PhyscData("김채원", 168, 0.3),
        };

        System.out.print("몇 cm인 사람을 찾고 있나요? : ");
        int height = scan.nextInt();

        int index = Arrays.binarySearch(
                arrayPhyscData,
                new PhyscData("", height, 0.0),
                PhyscData.HEIGHT_ORDER
        );

        if (index < 0) {
            System.out.println("요소가 없다");
        } else {
            System.out.println("x[" + index + "]에 있습니다.");
            System.out.println("찾은 데이터 : " + arrayPhyscData[index]);
        }
    }

    //데이터 클래스(height 오름차순)
    static class PhyscData {
        private String  name;
        private int     height;
        private double  vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER
                = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                if(d1.height > d2.height) {
                    return 1;
                } else if (d1.height < d2.height) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}

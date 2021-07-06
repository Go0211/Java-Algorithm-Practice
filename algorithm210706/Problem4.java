package algorithm210706;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//이진 검색 (제네릭 binarySearch)
public class Problem4 {

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PhyscData[] physcData = {
                new PhyscData("장원영", 172, 2.0),
                new PhyscData("안유진", 170, 1.9),
                new PhyscData("조유리", 162, 1.8),
                new PhyscData("히토미", 165, 1.7),
                new PhyscData("나코", 159, 1.6),
                new PhyscData("김민주", 168, 1.5),
                new PhyscData("김채원", 164, 1.5),
                new PhyscData("이채연", 169, 1.4),
                new PhyscData("강혜원", 163, 1.4),
                new PhyscData("최예나", 165, 1.3),
                new PhyscData("사쿠라", 164, 1.2),
                new PhyscData("권은비", 160, 1.1)
        };

        System.out.print("시력이 얼마인 사람을 찾고있나요? : ");
        double vision = scan.nextDouble();

        int indexValue = Arrays.binarySearch(
                physcData,
                new PhyscData("", 0, vision),
                PhyscData.VISION_ORDER
        );

        if (indexValue < 0) {
            System.out.println("요소가 없다");
        } else {
            System.out.println("x[" + indexValue + "]에 있습니다.");
            System.out.println("찾은 데이터 : " + physcData[indexValue]);
        }
    }

    //데이터 클래스 (vision 내림차순)
    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhyscData> VISION_ORDER = new visionOrderComparator();

        public static class visionOrderComparator implements Comparator<PhyscData> {
            @Override
            public int compare(PhyscData v1, PhyscData v2) {
                if (v1.vision < v2.vision) {
                    return 1;
                } else if (v1.vision > v2.vision) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}

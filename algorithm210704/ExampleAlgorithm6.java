package algorithm210704;

import java.util.Scanner;

//건강검진 알고리즘
public class ExampleAlgorithm6 {

    static final int VMAX = 21;

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PhysicalData[] izoneMember = {
                new PhysicalData("강혜원", 162, 0.3),
                new PhysicalData("권은비", 160, 0.4),
                new PhysicalData("김채원", 172, 0.5),
                new PhysicalData("김민주", 165, 0.5),
                new PhysicalData("이채연", 168, 0.5),
                new PhysicalData("최예나", 162, 0.1),
                new PhysicalData("조유리", 162, 0.9),
                new PhysicalData("장원영", 172, 1.0),
                new PhysicalData("안유진", 168, 1.3),
        };

        int[] vdist = new int[VMAX];

        for (int i = 0; i < izoneMember.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n",
                    izoneMember[i].name, izoneMember[i].height, izoneMember[i].vision);
        }

        System.out.printf("\n 평균 키 : %5.1fcm\n",
                aveHeight(izoneMember));

        distVision(izoneMember, vdist);

        System.out.println("시력분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~ : %2d명\n", i / 10.0, vdist[i]);
        }
    }

    //클래스
    static class PhysicalData {
        String name;
        int height;
        double vision;

        PhysicalData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    //평균 키
    static double aveHeight(PhysicalData[] memberData) {
        double sum = 0;

        for (int index = 0; index < memberData.length; index++) {
            sum += memberData[index].height;
        }

        return sum / memberData.length;
    }

    //시력 분포
    static void distVision(PhysicalData[] memberData, int[] vdist) {
        int index = 0;
        vdist[index] = 0;

        for (index = 0; index < memberData.length; index++) {
            if (memberData[index].vision >= 0.0
                    && memberData[index].vision <= VMAX / 10.0) {
                vdist[(int)(memberData[index].vision * 10)]++;
            }
        }
    }
}

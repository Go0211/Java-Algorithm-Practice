package algorithm210704;

import java.util.Scanner;

//건강검진 알고리즘
public class ExampleAlgorithm6 {

    static final int VMAX = 21;

    //메인
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("강혜원", 162, 0.3),
                new PhyscData("권은비", 162, 0.3),
                new PhyscData("김채원", 162, 0.3),
                new PhyscData("김민주", 162, 0.3),
                new PhyscData("이채연", 162, 0.3),
                new PhyscData("최예나", 162, 0.3),
                new PhyscData("조유리", 162, 0.3),
                new PhyscData("장원영", 162, 0.3),
                new PhyscData("안유진", 162, 0.3),
        };

        int[] vdist = new int[VMAX];

        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        }

        System.out.printf("\n 평균 키 : %5.1fcm\n", aveHeight(x));

        distVision(x, vdist);

        System.out.println("시력분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~ : %2d명\n", i / 10.0, vdist[i]);
        }
    }

    //클래스
    static class PhyscData {
        String name;
        int height;
        double vision;

        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    //평균 키
    static double aveHeight(PhyscData[] dat) {
        double sum = 0;

        for (int i = 0; i < dat.length; i++) {
            sum += dat[i].height;
        }

        return sum / dat.length;
    }

    //시력 분포
    static void distVision(PhyscData[] dat, int[] dist) {
        int i = 0;

        dist[i] = 0;

        for (i = 0; i < dat.length; i++) {
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
                dist[(int)(dat[i].vision * 10)]++;
            }
        }
    }
}

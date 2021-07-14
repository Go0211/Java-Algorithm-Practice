package algorithm210714;

import java.util.Arrays;
import java.util.Comparator;

//자연 정렬 안되는 Arrays.sort
public class ExampleAlgorithm5 {

    //메인
    public static void main(String[] args) {
        PhyscDate[] array = {
                new PhyscDate("강혜원", 167, 1.5),
                new PhyscDate("최예나", 164, 1.2),
                new PhyscDate("조유리", 160, 1.1),
                new PhyscDate("김채원", 161, 1.0),
        };

        Arrays.sort(array, PhyscDate.HEIGHT_ORDER);

        System.out.println("신체 검사");
        System.out.println("이름     키      시력");
        System.out.println("----------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n",
                    array[i].name,
                    array[i].height,
                    array[i].vision);
        }
    }

    //클래스
    static class PhyscDate {
        String name;
        int height;
        double vision;

        PhyscDate(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        static final Comparator<PhyscDate> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscDate> {
            @Override
            public int compare(PhyscDate o1, PhyscDate o2) {
                if (o1.height > o2.height) {
                    return 1;
                } else if (o1.height < o2.height){
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}

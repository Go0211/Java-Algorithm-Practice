package algorithm210714;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class ExampleAlgorithm4 {

    //메인
    public static void main(String[] args) {
        GregorianCalendar[] array = {
                new GregorianCalendar(2017, 11, 1),
                new GregorianCalendar(2020, 1, 25),
                new GregorianCalendar(2018, 10, 29)
        };

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%04d년 %02d월 %02d일\n",
                    array[i].get(GregorianCalendar.YEAR),
                    array[i].get(GregorianCalendar.MONTH),
                    array[i].get(GregorianCalendar.DATE));
        }
    }
}

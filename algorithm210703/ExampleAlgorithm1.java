package algorithm210703;

//기본적인 배열의 특성 확인
// ※ 배열 초기화를 안하면 0으로 자동 초기화
public class ExampleAlgorithm1 {
    public static void main(String[] args) {
        int[] array = new int [5];

        array[1] = 37;
        array[2] = 51;
        array[4] = array[1] * 2;

        for (int imsiNum = 0; imsiNum < array.length; imsiNum++) {
            System.out.print("a["+ imsiNum +"] = " + array[imsiNum]);
            System.out.println();
        }
    }
}

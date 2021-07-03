package algorithm210703;

//배열을 초기화하는 다른 방법
public class ExampleAlgorithm2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        for (int imsiNum = 0; imsiNum < array.length; imsiNum++) {
            System.out.print("a[" + imsiNum + "] = " + array[imsiNum]);
            System.out.println();
        }
    }
}

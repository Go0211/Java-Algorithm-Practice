package algorithm210703;

//배열 클론 사용법
public class ExampleAlgorithm3 {
    public static void main(String[] args) {
        int arrayOne[] = {1, 2, 3, 4, 5};
        int arrayTwo[] = arrayOne.clone();

        for (int imsiNum = 0; imsiNum < arrayOne.length; imsiNum++) {
            System.out.print("a[" + imsiNum + "] = " + arrayOne[imsiNum]);
            System.out.println();
        }

        System.out.println();
        System.out.println("------------------");

        for (int imsiNum = 0; imsiNum < arrayTwo.length; imsiNum++) {
            System.out.print("b[" + imsiNum + "] = " + arrayTwo[imsiNum]);
            System.out.println();
        }
    }
}

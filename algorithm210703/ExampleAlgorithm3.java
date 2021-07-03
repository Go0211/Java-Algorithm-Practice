package algorithm210703;

//배열 클론 사용법
public class ExampleAlgorithm3 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = a.clone();

        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = " + a[i]);
            System.out.println();
        }

        System.out.println();
        System.out.println("------------------");

        for (int i = 0; i < b.length; i++) {
            System.out.print("b[" + i + "] = " + b[i]);
            System.out.println();
        }
    }
}

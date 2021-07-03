package algorithm210703;

//기본적인 배열의 특성 확인
// ※ 배열 초기화를 안하면 0으로 자동 초기화
public class ExampleAlgorithm1 {
    public static void main(String[] args) {
        int[] a = new int [5];

        a[1] = 37;
        a[2] = 51;
        a[4] = a[1] * 2;

        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+ i +"] = " + a[i]);
            System.out.println();
        }
    }
}

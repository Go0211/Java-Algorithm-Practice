package algorithm210704;

//소수를 구하는 알고리즘 수정본1 (소수로만 계산)
public class ExampleAlgorithm3 {
    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;

        for (int n = 3; n < 1000; n++) {
            int i;

            for (i = 1; i < ptr; i++) {
                counter++;

                if (n % prime[i] == 0) {
                    break;
                }
            }

            if (ptr == i)
                prime[ptr++] = n;
        }

        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }

        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}

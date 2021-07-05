package algorithm210704;

//소수를 구하는 알고리즘 수정본2(제곱근을 사용)
public class ExampleAlgorithm4 {
    public static void main(String[] args) {
        int counter = 0;
        int primeIndex = 0;
        int[] prime = new int[500];

        prime[primeIndex++] = 2;
        prime[primeIndex++] = 3;

        for (int n = 5; n < 1000; n += 2) {
            boolean flag = false;

            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;

                if (n % prime[i] == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                prime[primeIndex++] = n;
                counter++;
            }
        }

        for (int i = 0; i < primeIndex; i++) {
            System.out.println(prime[i]);
        }

        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}

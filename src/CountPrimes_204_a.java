/**
 * Created by 桢 on 2017/4/13.
 */
public class CountPrimes_204_a {
    public static void main(String[] args) {
        long startTime=System.nanoTime();
        CountPrimes_204_a cc = new CountPrimes_204_a();
        System.out.println(cc.countPrimes(999999999));
        long endTime=System.nanoTime();
        System.out.println((endTime-startTime)/1000);
    }

    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }
}

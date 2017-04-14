/**
 * Created by 桢 on 2017/4/14.
 */
public class CountPrimes_204_b {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        CountPrimes_204_b cc = new CountPrimes_204_b();
        System.out.println(cc.countPrimes(15000000));
        long endTime = System.nanoTime();
        System.out.println("Method b: "+(endTime - startTime) / 1000);
        CountPrimes_204_a aa = new CountPrimes_204_a();
        long finalTime = System.nanoTime();
        System.out.println(aa.countPrimes(15000000));
        System.out.println("Method a: "+(finalTime - endTime) / 1000);

    }

    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) {
                count++;
                for (int j = 2; j * i < n; j++) {
                    notPrime[j * i] = true;
                }
            }

        }
        return count;
    }
}

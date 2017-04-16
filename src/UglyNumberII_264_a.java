/**
 * Created by 桢 on 2017/4/16.
 */
public class UglyNumberII_264_a {
    public static void main(String[] args) {
        UglyNumberII_264_a u=new UglyNumberII_264_a();
        System.out.println(u.nthUglyNumber(7));
    }

    public int nthUglyNumber(int n) {
        int[] u = new int[n];
        u[0] = 1;
        for (int i = 1, i2 = 0, i3 = 0, i5 = 0; i < n; i++) {
            u[i] = Math.min(Math.min(u[i2] * 2, u[i3] * 3), u[i5] * 5);
            if (u[i] == u[i2] * 2) i2++;
            if (u[i] == u[i3] * 3) i3++;
            if (u[i] == u[i5] * 5) i5++;
        }

        return u[n-1];
    }

}

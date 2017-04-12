/**
 * Created by 桢 on 2017/4/12.
 */
public class HammingDistance_461_b {
    public static void main(String[] args){
        HammingDistance_461_b h=new HammingDistance_461_b();
        System.out.println(h.hammingDistance(123152341,891734123));
    }

    public int hammingDistance(int x, int y){
        return Integer.bitCount(x^y);
    }
}

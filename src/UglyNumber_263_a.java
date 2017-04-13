
import java.util.HashSet;
import java.util.Set;


/**
 * Created by 桢 on 2017/4/13.
 */
public class UglyNumber_263_a {
    public static void main(String[] args){
        UglyNumber_263_a u=new UglyNumber_263_a();
        System.out.println(u.isUgly(905391979));
    }

    public boolean isUgly(int num) {
        if(num<=0) return false;
        HashSet<Integer> set = new HashSet<>();
        int prime=2;
        if(num==1) return true;
        while(prime<=num){
            if(prime==num){
                set.add(prime);
                break;
            }
            if(num%prime==0){
                num=num/prime;
                set.add(prime);
            }else{
                prime++;
            }
        }
        HashSet<Integer> uglyPrime=new HashSet<>();
        uglyPrime.add(2);
        uglyPrime.add(3);
        uglyPrime.add(5);
        if(uglyPrime.containsAll(set)) return true;
        return false;
    }
}

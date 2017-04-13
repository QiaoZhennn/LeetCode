import java.util.HashSet;

/**
 * Created by 桢 on 2017/4/13.
 */
public class UglyNumber_263_b {

    public static void main(String[] args){
        long startTime=System.nanoTime();

        UglyNumber_263_b u=new UglyNumber_263_b();
        System.out.println(u.isUgly(905391979));
        long endTime=System.nanoTime();
        System.out.println((endTime-startTime)/1000);
    }

    public boolean isUgly(int num) {
        for(int i=2;i<6 && num>0;i++){
            while(num%i==0){
                num/=i;
            }
        }
        return num==1;
    }
}

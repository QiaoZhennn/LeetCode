/**
 * Created by 桢 on 2017/4/12.
 */
public class AddBinary_67_a {

    public static void main(String[] args){
        AddBinary_67_a aa=new AddBinary_67_a();
        String s1="1111" ;
        String s2="111";
        System.out.println(aa.addBinary(s1,s2));
    }

    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int sum=0;
        int carry=0;

        StringBuffer sb=new StringBuffer("");

        while (i>=0 || j>=0){
            if(i>=0) sum += a.charAt(i--)-'0';
            if(j>=0) sum += b.charAt(j--)-'0';
            sum += carry;
            if(sum>1) {
                carry =1;
                sum=sum%2;
            }
            else carry=0;
            sb.append(sum);
            sum=0;
        }
        if(carry!=0) sb.append(carry);

        return sb.reverse().toString();
    }
}

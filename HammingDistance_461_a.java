public class Solution{
    public int hammingDistance(int x, int y) {
        String sx;
        String sy;
        int ans=0;
        String sum;
        sx=Integer.toBinaryString(x);
        sy=Integer.toBinaryString(y);
        StringBuffer sblong;
        StringBuffer sbshort;
        if(sx.length()>=sy.length()) {
            sblong=new StringBuffer(sx);
            sbshort=new StringBuffer(sy);
        }else{
            sblong=new StringBuffer(sy);
            sbshort=new StringBuffer(sx);
        }
        sblong=sblong.reverse();
        sbshort=sbshort.reverse();
        //System.out.println(sblong+","+sbshort);
        for(int i=0;i<sbshort.length();i++){
            char a=sblong.charAt(i);
            char b=sbshort.charAt(i);
            sum= String.valueOf(Integer.parseInt(String.valueOf(a))+Integer.parseInt(String.valueOf(b)));
            //System.out.println(Integer.parseInt(String.valueOf(a))+","+Integer.parseInt(String.valueOf(b)));
            sblong.replace(i,i+1,sum);
        }
        //System.out.println(sblong+","+sbshort);
        for(int i=0;i<sblong.length();i++){
            if(sblong.charAt(i)=='1') ans++;
        }
        return ans;
    }
}
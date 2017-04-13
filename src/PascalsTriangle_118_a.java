import java.util.ArrayList;
import java.util.List;

/**
 * Created by 桢 on 2017/4/13.
 */
public class PascalsTriangle_118_a {
    public static void main(String[] args){

        PascalsTriangle_118_a p=new PascalsTriangle_118_a();
        int numRows=3;
        System.out.println(p.generate(numRows));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    row.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            ans.add(i,row);
        }
        return ans;
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 桢 on 2017/4/18.
 */
public class PascalsTriangleII_119_a {
    public static void main(String[] args){
        PascalsTriangleII_119_a p=new PascalsTriangleII_119_a();
        System.out.println(p.getRow(-1));
    }
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex<0) return null;
        List<Integer> row=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            row.add(1);
            for (int j=i-1;j>0;j--){
                row.set(j,row.get(j)+row.get(j-1));

            }
        }
        return row;
    }
}

/**
 * Created by 桢 on 2017/4/12.
 */
public class TwoSum_1_a {
    public static void main(String[] args){
        TwoSum_1_a t=new TwoSum_1_a();
        int[] nums=new int[]{1,2,3,4};
        int target=4;
        System.out.println(t.twoSum(nums,target)[0]+","+t.twoSum(nums,target)[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            int a=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(a==nums[j]){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }

        }
        return ans;
    }
}

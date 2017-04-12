/**
 * Created by 桢 on 2017/4/12.
 */
public class FindPeakElement_162_a {
    public static void main(String[] args) {
        int[] nums1=new int[]{2,1};
        FindPeakElement_162_a f = new FindPeakElement_162_a();

        System.out.println(f.findPeakElement(nums1));
    }

    public int findPeakElement(int[] nums) {
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if (i == 0) {
                if(nums.length==1) return i;
                if (nums[i] > nums[i+1]) return i;
            }
            else if (i == nums.length - 1) {
                if (nums[i] > nums[i - 1]) return i;
            }
            else {
                if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) return i;
            }
        }
        return i;
    }

}

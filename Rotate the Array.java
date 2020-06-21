// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/

class Solution {
    public void rotate(int[] nums, int k) {
     
        for(int j=0;j<k;j++)
        {
            
            int temp=nums[nums.length-1];
            for(int i=nums.length-2;i>=0;i--)
                nums[i+1]=nums[i];
            
            nums[0]=temp;
        }
    }
}

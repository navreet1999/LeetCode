//https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int res[]=new int[2];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target - nums[i]))
            {
                res[0]=i;
                res[1]=map.get(target - nums[i]);
            }
            map.put(nums[i],i);
        }
        return res;
        
    }
}
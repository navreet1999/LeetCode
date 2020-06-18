//https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/776/

class Solution {
//     
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        
        // O(n log(n))
        Arrays.sort(nums);
        
        // O(n^2) since we loop through every element here and then we do the while loop within the code
        for(int i=0; i<nums.length-1; i++)
        {   
            int cur = nums[i];
            int left = i+1;
            int right = nums.length-1;
            
            //O(n)
            while(left < right)
            {
                int totalSum = cur + nums[left] + nums[right];
            
                if(totalSum == 0)
                {
                    List<Integer> solution = new ArrayList<>();
                    solution.add(cur);
                    solution.add(nums[left]);
                    solution.add(nums[right]);
                    
                    set.add(solution);
                    
                    left++;
                    right--;
                }
                else if(totalSum > 0)
                {
                    right--;
                }
                else
                {
                    left++;
                }   
            }
        }
        res.addAll(set);
        
        return res;
    }
}

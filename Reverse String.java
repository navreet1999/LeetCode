//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/

class Solution {
    public void reverseString(char[] s) {
        
        int left=0;
        int right=s.length-1;
        
        while(left<right)
        {
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            
            left++;
            right--;
        }
    }
}

class Solution {
   
    public boolean isPalindrome(String str) {
        String s=str.toLowerCase();
        int left=0;
        int right=s.length()-1;
        
        while(left<right)
        {
            char c=s.charAt(left);
            char c2=s.charAt(right);
           
         if(!Character.isLetterOrDigit(c))
                left++;
         else  if(!Character.isLetterOrDigit(c2))
                right--;
             
         else if(Character.toLowerCase(c)!=Character.toLowerCase(c2))
                return false;
                
        else{
             
            left++;
            right--;
        }
         
            
        }
        return true;
    }
}

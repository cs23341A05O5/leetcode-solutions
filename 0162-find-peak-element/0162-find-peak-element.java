class Solution {
    public int findPeakElement(int[] nums) {
        for(int i = 0; i < nums.length; i++)
        {
            // Check if nums[i] is greater than both neighbors
            if((i == 0 || nums[i] > nums[i-1]) && 
               (i == nums.length-1 || nums[i] > nums[i+1]))
            {
                return i;  // ✅ return INDEX not value
            }
        }
        return 0;
    }
}
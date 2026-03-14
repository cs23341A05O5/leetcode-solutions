class Solution {
    
    public int lowerBound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int ans = nums.length;          // default: not found
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    
    public int upperBound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int ans = nums.length;          
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {  
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums, target);
        
        
        if (lb == nums.length || nums[lb] != target)
            return new int[]{-1, -1};
        
        int ub = upperBound(nums, target) - 1;  
        
        return new int[]{lb, ub};
    }
}

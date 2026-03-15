class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;              
        if (k == 0) return;     

        reverse(nums, 0, n - 1);    // Step 1: reverse entire array
        reverse(nums, 0, k - 1);    // Step 2: reverse first k elements
        reverse(nums, k, n - 1);    // Step 3: reverse remaining elements
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
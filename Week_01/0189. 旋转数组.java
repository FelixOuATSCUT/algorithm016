class Solution {
    public void rotate(int[] nums, int k) {
         int[] nums_copy = new int[nums.length];
         for(int i= 0; i<nums.length;i++) {
             nums_copy[(i+k) % nums.length] = nums[i];
         }

         for(int i =0; i<nums.length;i++) {
             nums[i] = nums_copy[i];
         }
    }
}
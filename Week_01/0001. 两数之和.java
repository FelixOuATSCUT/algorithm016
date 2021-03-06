class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            Integer gap = target - nums[i];
            if(map.get(nums[i]) != null) {
                return new int[] {map.get(nums[i]), i};
            }
            map.put(gap, i);
        }
        return null;
    }
}
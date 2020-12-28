class Solution {
    public int lengthOfLIS(int[] nums) {
        int length = nums.length;

        if(length == 0) {
            return 0;
        }

        int[] dp = new int[length];

        int maxans = 1;
        dp[0] = 1;

        for(int i = 0; i < length  ; i++) {
            dp[i] = 1;

            for(int j = 0; j < i; j++) {
                if(nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i] , dp[j] + 1);
                }
            }

            maxans = Math.max(dp[i], maxans);
        }

        return maxans;
    }
}

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<Integer , Integer> dp = new HashMap<>();
        dp.put(0 , 1);

        for(int num : nums){
            Map<Integer , Integer> nextdp = new HashMap<>();

            for(int sum : dp.keySet()){
                int count = dp.get(sum);

                nextdp.put(sum + num , nextdp.getOrDefault(sum + num , 0) + count);
                 nextdp.put(sum - num , nextdp.getOrDefault(sum - num , 0) + count);
            }
            dp = nextdp;
        }
        return dp.getOrDefault(target , 0);

        // return helper(nums , target , 0, 0 );
    }
    // private int helper(int[] nums , int target , int idx , int sum){
    //     if(idx >= nums.length) return sum == target ? 1 : 0;

    //     int subtract = helper(nums , target , idx + 1 , sum - nums[idx]);
    //     int add = helper(nums , target , idx + 1 , sum + nums[idx]);

    //     return subtract + add;
    // }
}
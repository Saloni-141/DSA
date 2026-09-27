class Solution {
    public int rob(int[] nums) {
        if(nums.length < 2) return nums[0];

        int[] lskip = new int[nums.length-1];
        int[] fskip = new int[nums.length-1];

        for(int i=0; i<nums.length-1; i++){
            lskip[i] = nums[i];
            fskip[i] = nums[i+1];
        }

        int lootlast = rober(lskip);
        int lootfirst = rober(fskip);

        return Math.max(lootlast , lootfirst);
    }
    private int rober(int[] nums){
        if(nums.length < 2) return nums[0];
        int first = nums[0];
        int sec = Math.max(nums[0] , nums[1]);
        for(int i=2; i<nums.length; i++){
            int temp = sec;
            sec = Math.max(nums[i] + first , sec);
            first = temp;
        }
        return sec;
    }
}
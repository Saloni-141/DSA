class Solution {
    public int climbStairs(int n) {
        if(n <= 3) return n;
        // return climbStairs(n-1) + climbStairs(n-2);

        int[] map = new int[n+1];

        map[0] = 0;
        map[1] = 1;
        map[2] = 2;
        map[3] = 3;

        for(int i=3; i<=n; i++){
            map[i] = map[i-1] + map[i-2];
        }
        return map[n];
    }
}
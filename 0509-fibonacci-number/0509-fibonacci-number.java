class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        // return fib(n-1) + fib(n-2);

        // int[] map = new int[n+1];

        // map[0] = 0;
        // map[1] = 1;

        // for(int i=2; i<=n; i++){
        //     map[i] = map[i-1] + map[i-2];
        // }

        // return map[n];


        int first = 0;
        int sec = 1;
        
         for(int i=2; i<=n; i++){
           
            sec += first;
            first = sec - first;
         }
         return sec;
    }
}
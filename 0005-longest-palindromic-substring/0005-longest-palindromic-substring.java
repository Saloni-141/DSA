class Solution {
    public String longestPalindrome(String s) {
        // if(s.length() <= 1) return s;
        // String LPS = "";
        // for(int i=1; i<s.length(); i++){
        //     //odd length
        //     int low=i, high=i;
        //     //keep extending on both right and left direction till the condition of palindrome meets
        //     while(s.charAt(low) == s.charAt(high)){
        //         low--;
        //         high++;
        //         //terminating condition if we reach end/start og string
        //         if(low == -1 || high == s.length()) break;
        //     }
        //     // index low and high can be used to extract the substring
        //     String palindrome = s.substring(low+1 , high);
        //     if(palindrome.length() > LPS.length()){
        //         //capture the longest substring found
        //         LPS = palindrome;
        //     }

        //     //even length
        //     low = i-1;
        //     high = i;
        //     while(s.charAt(low) == s.charAt(high)){
        //         low--;
        //         high++;
        //         if(low == -1 || high == s.length()) break;
        //     }

        //      palindrome = s.substring(low+1 , high);
        //     if(palindrome.length() > LPS.length()){
        //         //similarly kep track of longest substring
        //         LPS = palindrome;
        //     }
        // }
        // return LPS;

        if(s.length() <= 1) return s;
        String maxstr = s.substring(0,1);
        for(int i=0; i<s.length(); i++){
            String odd = expandcenter(s,i,i);
            String even = expandcenter(s,i,i+1);

            if(odd.length() > maxstr.length()) maxstr = odd;
            if(even.length() > maxstr.length()) maxstr = even;
        }
        return maxstr;
    }

    private String expandcenter(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }
}
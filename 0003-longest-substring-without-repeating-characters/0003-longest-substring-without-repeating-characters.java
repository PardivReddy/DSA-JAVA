class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq=new int[128];
        int n=s.length();
        int i=0,j=0;
        int maxlen=0;
        while(j<n){
            char c=s.charAt(j);
            freq[c]++;
            while(freq[c]>1){
                freq[s.charAt(i)]--;
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }
}
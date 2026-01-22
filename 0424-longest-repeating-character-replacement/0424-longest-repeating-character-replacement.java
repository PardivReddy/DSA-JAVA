class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int maxfreq=0;
        int maxlen=0;
        Map<Character,Integer> freq=new HashMap<>();
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,freq.get(ch));
            while((right-left+1)-maxfreq>k){
                char cleft=s.charAt(left);
                freq.put(cleft,freq.get(cleft)-1);
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;

    }
}
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        if(s.length() < p.length()){
            return res;
        }
        int[] pfreq=new int[26];
        int[] window=new int[26];
        for(char ch:p.toCharArray()){
            pfreq[ch-'a']++;


        }
        int k=p.length();
        for(int i=0;i<s.length();i++){
            window[s.charAt(i)-'a']++;
            if (i >= k) {
                window[s.charAt(i - k) - 'a']--;
            }
            if (Arrays.equals(pfreq, window)) {
                res.add(i - k + 1);
            }
        }
        return res;
    }
}
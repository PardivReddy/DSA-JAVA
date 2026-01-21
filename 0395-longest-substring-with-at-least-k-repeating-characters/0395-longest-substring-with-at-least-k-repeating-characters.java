class Solution {
    public int longestSubstring(String s, int k) {
        char[] arr = s.toCharArray();
        return helper(arr,0,s.length(),k);
    }
    private int helper(char[] arr,int s,int e ,int k){
        if(e-s<k){
            return 0;
        }

        Map<Character,Integer> freq= new HashMap<>();
        for(int i=s;i<e;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);

        }
        for(int i=s;i<e;i++){
            if(freq.get(arr[i])<k){
                int left=helper(arr,s,i,k);
                int right=helper(arr,i+1,e,k);
                return Math.max(left,right);
            }
        }
            return e-s;

    }
}
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int k=10;
        int n=s.length();
        Set<String> seen=new HashSet<>();
        Set<String> repeated=new HashSet<>();
        for(int i=0;i<=n-k;i++){
            String sb=s.substring(i,i+k);
            
            if(seen.contains(sb)){
                repeated.add(sb);
            }
            else{
                seen.add(sb);
            }
        }
        return new ArrayList<>(repeated);
        
    }
}
class Solution {
    Map<String,Boolean>memo=new HashMap<>();
    public boolean isMatch(String s, String p) {
        return match(0,0,s,p);
    }
    private boolean match(int i,int j,String s,String p){
        String key=i+","+j;
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        if(j==p.length() ){
            return i==s.length();
        }
        boolean firstmatch=(i<s.length() && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.'));
        boolean ans;
        if(j+1<p.length() && p.charAt(j+1)=='*'){
            ans=match(i,j+2,s,p) || (firstmatch && match(i+1,j,s,p));
        }
        else{
            ans=firstmatch && match(i+1,j+1,s,p);
        }
        memo.put(key,ans);
        return ans;
    }


}
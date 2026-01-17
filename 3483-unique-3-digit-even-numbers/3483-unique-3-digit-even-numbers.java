class Solution {
    Set<Integer> set=new HashSet<>();
    public int totalNumbers(int[] digits) {
        boolean[] used=new boolean[digits.length];
        dfs(digits,used,0,0);
        return set.size();
    }
    public void dfs(int[] digits,boolean[] used,int pos,int num){
        if(pos==3){
            if(num %2 ==0){
                set.add(num);
            }
            return;
        }
        for(int i=0;i<digits.length;i++){
            if(used[i]){
                continue;
            }
            if(pos==0 && digits[i]==0){
                continue;
            }
            used[i]=true;
            dfs(digits,used,pos+1,num*10+digits[i]);
            used[i]=false;
        }
    }
}
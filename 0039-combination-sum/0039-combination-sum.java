class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates,target,0,new ArrayList<>());
        return res;
    }
    void backtrack(int[] candidates,int target,int start,List<Integer> curr){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        else if(target<0){
            return ;
        }
        int sum=0;
        for(int i=start;i<candidates.length;i++){
            curr.add(candidates[i]);
            backtrack(candidates,target-candidates[i],i,curr);
            curr.remove(curr.size()-1);
            
        }
       

    }
}
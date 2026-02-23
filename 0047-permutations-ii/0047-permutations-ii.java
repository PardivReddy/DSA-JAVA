class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] used=new boolean[nums.length];
        backtrack(nums,new ArrayList<>(),used);
        return res;
    }
    void backtrack(int[] nums,List<Integer> curr,boolean[] used){
       // res.add(new ArrayList<>(curr));
       if(curr.size()==nums.length){
        res.add(new ArrayList<>(curr));
        return;
       }
        for(int i=0;i<nums.length;i++){
            
       if(used[i]){
        continue;
       }
       if(i>0 && nums[i]==nums[i-1] && !used[i-1]){
        continue;
       }
       used[i]=true;
            curr.add(nums[i]);
            backtrack(nums,curr,used);
            curr.remove(curr.size()-1);
            used[i]=false;
        }
    }
}
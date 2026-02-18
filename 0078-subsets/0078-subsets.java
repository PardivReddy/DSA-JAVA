class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums,0,new ArrayList<>());
        return res;
    }
   void backtrack(int[] nums,int start,List<Integer>curr){
        res.add(new ArrayList<>(curr));
        for(int i=start;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(nums,i+1,curr);
            curr.remove(curr.size()-1);
        }
    }
}
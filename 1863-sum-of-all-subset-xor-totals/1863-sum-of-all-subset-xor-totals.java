class Solution {
    int res=0;
    List<List<Integer>> result=new ArrayList<>();
    public int subsetXORSum(int[] nums) {
        backtrack(nums,0,new ArrayList<>(),0);
        return res;
    }
    void backtrack(int[] nums,int start,List<Integer> curr,int currxor){
        result.add(new ArrayList<>(curr));
        res+=currxor;
        for(int i=start;i<nums.length;i++){
            curr.add(nums[i]);
            int newxor=currxor ^ nums[i];
            backtrack(nums,i+1,curr,newxor);
            curr.remove(curr.size()-1);
        }


    }
}
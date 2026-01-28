class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int count=freq.getOrDefault(nums[i],0);
            if(count<2){
                nums[j++]=nums[i];
                freq.put(nums[i],count+1);
            }
        }
        return j;
    }
}
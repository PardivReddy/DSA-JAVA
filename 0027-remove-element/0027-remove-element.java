class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int writeIndex=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]!=val){
                nums[writeIndex]=nums[i];
                writeIndex++;
            }
        }
        return writeIndex;
    }
}
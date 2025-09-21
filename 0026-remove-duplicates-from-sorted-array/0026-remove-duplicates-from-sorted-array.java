class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int len=nums.length;
        int count=1;
        int write=1;
        int c=nums[0];
            for(int j=1;j<len;j++){
                if(nums[j]!=c){
                     c=nums[j];
                      nums[write] = nums[j]; 
                write++;
                    count++;
                   
                }
                }
                    return count;
        }
        
}
class Solution {
    public int dominantIndex(int[] nums) {
        int size=nums.length;
        if(size==1){
            return 0;
        }
        int maxele=-1;
        int sec=-1;
        int idx=-1;
        for(int i=0;i<size;i++){
            if(nums[i]>maxele){
                sec=maxele;
                maxele=nums[i];
                idx=i;


            }
            else if(nums[i]> sec){
                sec=nums[i];
            }
        }
        return maxele >=2* sec?idx: -1;

    }
}
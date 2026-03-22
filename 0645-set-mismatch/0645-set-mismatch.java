class Solution {
    public int[] findErrorNums(int[] nums) {
        /*List<Integer> res=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        int duplicate=-1,missing=-1;
        int count=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)==2){
                duplicate=num;
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                missing=i;
            }
        }
        return new int[]{duplicate,missing};*/
        int i=0;
        int n=nums.length;
        while(i<n){
            int ci=nums[i]-1;
            if(nums[i]!=nums[ci]){
                int temp=nums[i];
                nums[i]=nums[ci];
                nums[ci]=temp;
            }else{
                i++;
            }

        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1){
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
}
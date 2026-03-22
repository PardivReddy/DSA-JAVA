class Solution {
    public int[] findErrorNums(int[] nums) {
        List<Integer> res=new ArrayList<>();
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
        return new int[]{duplicate,missing};
    }
}
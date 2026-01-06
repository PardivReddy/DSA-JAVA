class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer,Integer> hash=new HashMap<>();
         for(int num : nums){
            hash.put(num,hash.getOrDefault(num,0)+1);
         }
         PriorityQueue<Map.Entry<Integer,Integer>> heap=new PriorityQueue <>((a,b) -> a.getValue() - b.getValue());
         for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            heap.add(entry);
            if(heap.size()>k){
                heap.poll();
            }

         }
         int[] result=new int[k];
         int i=0;
         while(!heap.isEmpty()){
            result[i++]=heap.poll().getKey();
         }
         return result;
    }
}
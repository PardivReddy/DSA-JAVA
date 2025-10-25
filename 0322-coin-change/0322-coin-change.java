class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0){
            return 0;
        }
        Queue<Integer> q =new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.offer(0);
        visited.add(0);
        int steps=0;
        while(!q.isEmpty()){
            int size=q.size();
            steps++;
            for(int i=0;i<size;i++){
                int curr=q.poll();
                
                for(int coin:coins){
                    int next=curr+coin;
                    if(next==amount){
                        return steps;
                    }
                    if(next<amount && !visited.contains(next)){
                    visited.add(next);
                    q.offer(next);
                }
                }
                
            }
        }
        return -1;
    }
}
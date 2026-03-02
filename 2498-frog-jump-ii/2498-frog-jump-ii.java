class Solution {
    public int maxJump(int[] stones) {
        int n=stones.length;
        int max=0;
        if(n==2){
            return stones[1]-stones[0];
        }
        for(int i=2;i<n;i++){
            max=Math.max(max,stones[i]-stones[i-2]);
            
        }
        return max;
    }
}
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int tgas=0;
        int distance=0;
        int j=0;
        int start=0;
        for(int i=0;i<n;i++){
            distance=gas[i]-cost[i];
            tgas+=distance;
            j+=distance;
            if(j<0){
                start=i+1;
                j=0;
            }
        }
            return tgas>=0 ? start:-1;
    }
}
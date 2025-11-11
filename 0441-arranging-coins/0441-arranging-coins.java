class Solution {
    public int arrangeCoins(int n) {
        int k=0;
        for(int i=1;i<=n;i++){
            n-=i;
            if(n>=0){
                k++;
            }else{
                break;
            }
        }
        return k;
    }
}
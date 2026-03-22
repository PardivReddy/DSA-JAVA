class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int N=n*n;
        long sum=0;
        long sqsum=0;
        for(int[] row: grid){
            for(int num: row){
                sum=sum+num;
                sqsum+=(long)num*num;
            }
        }
        long expectedsum=(long)N*(N+1)/2;
        long squaresum=(long)N*(N+1)*(2*N+1)/6;
        long sumdiff=sum-expectedsum;
        long sqdiff=sqsum-squaresum;
        long sumxy=sqdiff/sumdiff;
        int repeating=(int)((sumdiff+sumxy)/2);
        int missing=(int)(repeating-sumdiff);
        return new int[]{repeating,missing};


    }
}
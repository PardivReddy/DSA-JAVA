class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int minabs=Integer.MAX_VALUE;
        int negcount=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int val=matrix[i][j];
                if (val<0){
                    negcount++;
                }
                int absval=Math.abs(val);
                sum=sum+absval;
                minabs=Math.min(minabs,absval);
            }
        }
        if(negcount%2!=0){
            sum=sum-2L*minabs;
        }
        return sum;
    }



}
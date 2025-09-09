class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0;int right=m*n-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row=mid/m;
            int col=mid%m;
            int midVal=matrix[row][col];
            if(midVal==target){
            return true;
            }
            else if(midVal<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] matrix=new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
         System.out.print("Enter target: ");
        int target = sc.nextInt();

        Solution sol = new Solution();
        System.out.println(sol.searchMatrix(matrix, target));
    }
}
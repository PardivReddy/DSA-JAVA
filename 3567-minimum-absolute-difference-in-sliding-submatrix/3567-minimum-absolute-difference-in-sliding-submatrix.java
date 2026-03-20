class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        if (k == 1) {
            return new int[m][n];
        }
        int[][] ans=new int[m-k+1][n-k+1];
        for(int i=0;i<=m-k;i++){
            for(int j=0;j<=n-k;j++){
                Set<Integer> set=new HashSet<>();
                for (int x = i; x < i + k; x++) {
                    for (int y = j; y < j + k; y++) {
                        set.add(grid[x][y]);
                    }
                }
                List<Integer> list=new ArrayList<>(set);
                Collections.sort(list);
                if (list.size() < 2) {
                    ans[i][j] = 0;
                    continue;
                }
                int mindiff=Integer.MAX_VALUE;
                for (int p = 1; p < list.size(); p++) {
                    mindiff = Math.min(mindiff, 
                        list.get(p) - list.get(p - 1));
                }

                ans[i][j] = mindiff;
            }
        }
        return ans;

    }
}
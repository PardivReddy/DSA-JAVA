class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if (k == 0 || n >= k + maxPts - 1) return 1.0;

        double[] dp = new double[n + 1];
        dp[0] = 1.0;
        double windowSum = 1.0; // sum of dp[i-1..i-maxPts] that are < k
        double res = 0.0;

        for (int i = 1; i <= n; i++) {
            dp[i] = windowSum / maxPts;

            if (i < k) windowSum += dp[i];
            else       res += dp[i];

            if (i - maxPts >= 0 && i - maxPts < k) {
                windowSum -= dp[i - maxPts];
            }
        }
        return res;
    }
}

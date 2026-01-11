class Solution {
    public boolean isPalindrome(String s) {
        String s2=s.toLowerCase();
        String result = s2.replaceAll("[^a-zA-Z0-9]", "");
        int left=0;
        int right=result.length()-1;
        while(left<right){
            if(result.charAt(left) != result.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
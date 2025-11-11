class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        char[] ch1=word1.toCharArray();
        char[] ch2=word2.toCharArray();
        StringBuilder s=new StringBuilder();

        for(int i=0;i<n || i<m;i++){
            if(i<n){
                s.append(ch1[i]);
            }
            if(i<m){
                s.append(ch2[i]);
            }
        }
        return s.toString();
    }
}
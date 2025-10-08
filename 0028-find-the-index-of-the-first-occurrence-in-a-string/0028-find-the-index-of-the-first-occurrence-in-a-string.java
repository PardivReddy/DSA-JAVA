class Solution {
    public int strStr(String haystack, String needle) {
        char[] ch=haystack.toCharArray();
        char[] ch1=needle.toCharArray();
        int hlen=ch.length;
        int nlen=ch1.length;
        if(hlen<nlen){
            return -1;
        }
        for(int i=0;i<=hlen-nlen;i++){
            int j=0;
            while(j<nlen && ch[i+j]==ch1[j]){
                j++;
            }
            if(j==nlen){
                return i;
            }
        }
        return -1;
    }
}
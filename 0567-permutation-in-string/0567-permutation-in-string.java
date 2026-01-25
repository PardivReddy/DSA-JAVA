class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m){
            return false;
        }
        Map<Character,Integer> map=new HashMap<>();
        char[] ch=s1.toCharArray();
        for(int i=0;i<n;i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }
        Map<Character ,Integer> map2=new HashMap<>();
        int window=s1.length();
        for(int j=0;j<s2.length();j++){
            char rightchar=s2.charAt(j);
            map2.put(rightchar,map2.getOrDefault(rightchar,0)+1);
            if(j>=window){
                char leftchar=s2.charAt(j-window);
                if(map2.get(leftchar)==1){
                    map2.remove(leftchar);
                }
                else{
                    map2.put(leftchar,map2.getOrDefault(leftchar,0)-1);
                }
            }
            if(map2.equals(map)){
                return true;
            }
        }
        return false;
    }
}
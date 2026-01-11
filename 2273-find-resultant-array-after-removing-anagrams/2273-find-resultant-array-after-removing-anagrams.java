class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result= new ArrayList<>();
        result.add(words[0]);
        String prev=sort(words[0]);
        for(int i=1;i<words.length;i++){
            String curr=sort(words[i]);
            if(!curr.equals(prev)){
                result.add(words[i]);
                prev=curr;
            }
        }
        return result;
    }
    private String sort(String word){
        char[] arr=word.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
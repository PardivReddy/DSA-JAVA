class Solution {
    List<String> res=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits.length()== 0) return res;
        String[] map={
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        backtrack(digits,0,new ArrayList<>(),map);
        return res;
    }
    void backtrack(String digits,int start,List<Character>curr,String[] map){
        if(digits.equals("1")){
            return;
        }
        //res.add(new ArrayList<>(current));
        StringBuilder sb=new StringBuilder();
        if(start == digits.length()){
            for(char ch: curr){
                sb.append(ch);

            }
            res.add(sb.toString());
            return ;
        }
        String letter=map[digits.charAt(start)-'0'];
        for(char ch: letter.toCharArray()){
            curr.add(ch);
            backtrack(digits,start+1,curr,map);
            curr.remove(curr.size()-1);
        }

    }
}
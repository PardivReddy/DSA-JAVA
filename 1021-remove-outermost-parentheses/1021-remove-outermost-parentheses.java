class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder string=new StringBuilder();
        int count=0;
        for(char c: s.toCharArray()){
            if(c=='('){
                if(count>0){
                    string.append(c);
                }
                count++;
            }
            else{
                count--;
                if(count>0){
                string.append(c);}
            }
        }
        return string.toString();
    }
}
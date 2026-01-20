class Solution {
    public String countOfAtoms(String formula) {
        Stack<Map<String,Integer>> stack=new Stack<>();
        stack.push(new HashMap<>());
        int i=0;
        int n=formula.length();
        while(i<n){
            char ch=formula.charAt(i);
            if(ch=='('){
                stack.push(new HashMap<>());
                i++;
            }
            else if(ch==')'){
                i++;
                int m=0;
                while(i<n && Character.isDigit(formula.charAt(i))){
                    m=m*10+(formula.charAt(i)-'0');
                    i++;
                }
                if(m==0)m=1;
                Map<String,Integer> top=stack.pop();
                Map<String,Integer> prev=stack.peek();
                for(String key:top.keySet()){
                    prev.put(key,prev.getOrDefault(key,0)+top.get(key)*m);
                }
            }
            else{
                StringBuilder sb=new StringBuilder();
                sb.append(formula.charAt(i++));
                while(i<n && Character.isLowerCase(formula.charAt(i))){
                    sb.append(formula.charAt(i++));
                }
                int num=0;
                while(i<n && Character.isDigit(formula.charAt(i))){
                    num=num*10 + (formula.charAt(i)-'0');
                    i++;
                }
                if(num==0) num=1;
                Map<String,Integer> map=stack.peek();
                map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+num);

            }
        }
        Map<String,Integer> res=stack.pop();
        TreeMap<String,Integer>sorted=new TreeMap<>(res);
        StringBuilder out=new StringBuilder();
        for(String k:sorted.keySet()){
            out.append(k);
            if(sorted.get(k)>1){
                out.append(sorted.get(k));
            }

        }
        return out.toString();

    }
}
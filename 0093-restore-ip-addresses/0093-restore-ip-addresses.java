class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res=new ArrayList<>();
        backtrack(s,0,0,"",res);
        return res;

    }
    private void backtrack(String s,int index,int parts,String path,List<String> res){
        if (parts == 4 && index == s.length()) {
            res.add(path.substring(0, path.length() - 1));
            return;
        }
        if (parts > 4) return;
        for (int len = 1; len <= 3 && index + len <= s.length();len++) {
            String segment = s.substring(index, index + len);
            if ((segment.startsWith("0") && segment.length() > 1) ||
                Integer.parseInt(segment) > 255) {
                continue;
            }

            backtrack(s, index + len, parts + 1, path + segment + ".", res);
        }
    }
}
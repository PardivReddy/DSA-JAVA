class Solution {
    public int calPoints(String[] operations) {
        int n=operations.length;
        int index=0;
        int res[]=new int[n];
        for(String op : operations){
            if(op.equals("C")){
            index--;
        }else if(op.equals("D")){
            res[index]=2*res[index-1];
            index++;
        }
        else if(op.equals("+")){
            res[index]=res[index-1]+res[index-2];index++;
        } else {
                res[index] = Integer.parseInt(op); 
                index++;
            }
        }
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += res[i];
        }
        return sum;


    }
}
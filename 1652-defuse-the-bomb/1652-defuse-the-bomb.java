class Solution {
    public int[] decrypt(int[] code, int k) {
        int i=0,sum=0,j=0;
        int n=code.length;
        int[] res=new int[code.length];
        if(k==0){
            return res;
        }
        if(k>0){
            i=1;
            j=k;
        }else{
            k=-k;
            i=n-k;
            j=n-1;
            
        }
        for(int a=i;a<=j;a++){
            sum +=code[a%n];
        }
        for(int a=0;a<n;a++){
            res[a]=sum;
            sum -=code[(i+a)%n];
            sum +=code[(j+a+1)%n];
        }
        return res;
    }
}
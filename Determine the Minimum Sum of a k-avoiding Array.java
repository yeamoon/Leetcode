class Solution {
    public int minimumSum(int n, int k) {
      int mid= (int)(Math.floor(k/2 ));
        System.out.println(mid);
        int sum=0;
        for(int i=1;i<=mid;i++){
            
            sum+=i;
            n--;
            if(n==0){
                return sum;
            }
        }
        int j=k;
        while(n!=0){
          sum+=j;
            j++;
            n--;
        }
        
        return sum;
    }
}
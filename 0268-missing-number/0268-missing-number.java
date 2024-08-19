class Solution {
    public int missingNumber(int[] nums) {
  /*      //BRUTE FORCE APPROACH
        int n=nums.length;
     
        for(int i=0;i<=n;i++){    //O(n)
             int flag=0;
           for(int j=0 ;j<n;j++){  //O(n)-worst case
               if(nums[j]==i){
                   flag=1;
                   break;
               }
           }
        if(flag == 0) return i;
        }
        return -1;
        //Overall it takes O(n^2)
        
        /*
        //BETTER APPROACH - use hashing but i'll do it later
        
 /*       //OPTIMAL APPROACH 1-SUM
        //Sn = n(n+1)/2 Hence, this is the formula to calculate sum of 'n' natural numbers.
        int n=nums.length;
        int sumofN_naturalnumbers=n*(n+1)/2;
    //    int missing=-1;
        int arraysum=0;
        for(int i=0;i<n;i++){
            arraysum+=nums[i];
        }
    //    missing= sumofN_naturalnumbers-arraysum;
        return sumofN_naturalnumbers-arraysum;
        //TAKES O(N)
   */     
        //OPTIMAL APPROACH 1-XOR
  /*      int n=nums.length;
        int xor1=0;    //0^1^2^3  0 t0 n
        int xor2=0;    //0^1^3    elements in array
        for(int i=0;i<=n;i++){
            xor1=xor1 ^ i;
        }
         for(int i=0;i<n;i++){
            xor2=xor2 ^ nums[i];
        }
        return xor1 ^ xor2;
        // Even it too takes O(n)+O(n)=O(2n) so we can optimize it further...
        */
        int n=nums.length;
        int XOR=0;
        for(int i=0;i<=n;i++){
            XOR=XOR ^ i;
        }
        for(int num : nums){
            XOR=XOR ^ num;
        }
        return XOR;
    }
}
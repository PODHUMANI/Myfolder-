class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] out =new int[2];
        
    try{ 

          for(int i=0;i<nums.length;i++)
          {
           for(int j=1;j<nums.length;j++)
           {
           
              if( target == (nums[i]+nums[j]))
              {
                out[0]=i;
                out[1]=j;
            
              }
              i--;
           }
           
           }
        }
           catch(Exception e){
            System.out.println("not the target");

           }
     return out;
      }
    
}

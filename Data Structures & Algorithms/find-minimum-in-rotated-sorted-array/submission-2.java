class Solution {
    public int findMin(int[] nums) {

        int low=0;
        int high=nums.length-1;

        int min=nums[0];

        while(low<high){

            

         
         if(nums[low]>nums[high]){
            low=low+1;
         }
         else if(nums[high]>nums[low]){
            high=high-1;
         }

         int mid=(low+high)/2;
         min=Math.min(min,nums[mid]);

        }
        return min;
        
    }
}

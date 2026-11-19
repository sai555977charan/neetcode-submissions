class Solution {
    public int findMin(int[] nums) {

        int low=0;
        int high=nums.length-1;

        int min=nums[0];
 int mid=(low+high)/2;
       

        while(low<high){
        
         if(nums[mid]>nums[high]){
            low=mid+1;
         }
         else {
            high=mid;
         }
         mid=(low+high)/2;
         min=Math.min(min,nums[mid]);

        }
        return min;
        
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

           

            

             Set<List<Integer>> set2= new HashSet<>();
 
            Arrays.sort(nums);
            
          


              for(int i=0; i< nums.length ; i++){
                if(i>0&&nums[i]==nums[i-1]){
                    continue;
                }
             int left=i+1;
             int right=nums.length-1;


              while(left<right){

              List<Integer> list1= new ArrayList<>();


              if(nums[i]+nums[left]+nums[right]<0){
              left++;
              }
              else if(nums[i]+nums[left]+nums[right]>0){
              right--;
              }
               else 
                {
                   list1.add(nums[i]);
                   list1.add(nums[left]);
                   list1.add(nums[right]);

                    set2.add(list1);
                   
                   left++;
                   right--;

                    while(left<right && nums[left]==nums[left-1]){
                left++;
             }

            while(left<right && nums[right]==nums[right+1]){
                right--;
             }

                }
               
            
               }
              }
              

            

       

            return new ArrayList<>(set2);
        
    }
}

class Solution {
    public int maxProfit(int[] prices) {

        int left=0;
        
int max=0;
int buy=prices[0];
        for(int right=1;right<prices.length;right++){

            if(buy>prices[right]){

                 buy=prices[right];
                 left++;
            }
            else
            {
             max=Math.max(prices[right]-buy,max);
            }


        }
        return max;
        
    }
}

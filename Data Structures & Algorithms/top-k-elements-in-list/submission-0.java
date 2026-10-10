class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int arr[] = new int[k];
        int j=0;

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++)
     { 
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        
    }


    Map<Integer, Integer> sortedMapDesc = map.entrySet().stream()
    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue())) // Safer syntax
    .collect(Collectors.toMap(
        Map.Entry::getKey, 
        Map.Entry::getValue, 
        (oldValue, newValue) -> oldValue, 
        LinkedHashMap::new
    ));

for(Integer keys: sortedMapDesc.keySet()){

    if(j<k)
    arr[j]=keys;
    j++;
}
return arr;

}

}

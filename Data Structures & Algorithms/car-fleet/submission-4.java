class Solution {
    public int carFleet(int target, int[] position, int[] speed) {


      Map<Integer, Double> map = new TreeMap<>(Collections.reverseOrder());

for (int i = 0; i < position.length; i++) {
    map.put(position[i], (double)(target - position[i]) / speed[i]);
}

double[] speeds = map.values().stream()
                    .mapToDouble(Double::doubleValue)
                    .toArray();

        Stack<Double> stack=new Stack<>();

       int max=1;

        for(int i=0;i<speeds.length;i++){

            if(!stack.isEmpty()){
            if(speeds[i]<=stack.peek()){
             if(stack.peek()==speeds[i]);
              continue;
            }
            }
            stack.push(speeds[i]);
            
        }
        
        return Math.max(max,stack.size());
    }
}

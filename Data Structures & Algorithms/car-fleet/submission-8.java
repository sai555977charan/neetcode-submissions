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

       int fleets = 0;
        double lastTime = 0;

        for (double time : map.values()) {
            if (time > lastTime) {
                fleets++;
                lastTime = time;
            }
        }
        return fleets;
    }
    }


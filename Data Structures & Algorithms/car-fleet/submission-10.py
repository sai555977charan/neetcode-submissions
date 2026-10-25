class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        size = len(position)
        time_position_speed = [0]*size
        
        for i in range(size):
            time = (target - position[i]) / speed[i]
            time_position_speed[i] = [time, position[i], speed[i]]
        
        time_position_speed.sort(key = lambda x :x[1], reverse = True)
        
        fleet = 1
        curr_idx = 0
        for i in range(size):
            if time_position_speed[i][0] > time_position_speed[curr_idx][0]:
                fleet+=1
                curr_idx = i
        return fleet
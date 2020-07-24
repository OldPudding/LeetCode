package twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Object> aMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            aMap.put(nums[i],i);
        }

        int temp;
        for (int j = 0; j < nums.length; j++) {
            temp = target - nums[j];
            if(aMap.get(temp)!=null && (int)aMap.get(temp) != j){
                return new int[]{j,(int)aMap.get(temp)};
            }
        }

        return new int[]{};
    }
}

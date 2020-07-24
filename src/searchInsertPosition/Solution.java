package searchInsertPosition;

import org.junit.Test;

public class Solution {
    @Test
    public void test(){
        Car a = new Car() {
            @Override
            public void run() {
                System.out.println("sdfasd");
            }
        };

        a.test();
    }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(target <= nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}

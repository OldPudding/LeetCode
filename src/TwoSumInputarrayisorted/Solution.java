package TwoSumInputarrayisorted;

import org.junit.Test;

import java.util.Arrays;

public class Solution {
    @Test
    public void test(){
        int[] a = twoSum(new int[]{2,7,11,15},9);
        System.out.println(Arrays.toString(a));
    }

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j= numbers.length -1;
        int sum = 0;
        while (i<j){
            sum = numbers[i] + numbers[j];
            if(sum < target){
                i++;
            }
            else if(sum > target){
                j--;
            }
            else{
                return new int[]{++i,++j};
            }
        }
        return new int[]{-1,-1};
    }
}

package LCOF;

public class Solution {
    public int minArray(int[] numbers) {
        int a = numbers[0];
        for (int i:
             numbers) {
            if(a > i){
                return i;
            }
        }
        return a;
    }
}

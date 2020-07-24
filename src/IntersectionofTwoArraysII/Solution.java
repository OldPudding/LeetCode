package IntersectionofTwoArraysII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

    }

    public int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        Map<Integer,Integer> num1Map = new HashMap<>();
        Map<Integer,Integer> num2Map = new HashMap<>();

        for (int item:
             nums1) {
            if(num1Map.get(item) == null){
                num1Map.put(item,1);
            }else{
                num1Map.put(item,num1Map.get(item)+1);
            }
        }

        for (int item:
                nums2) {
            if(num2Map.get(item) == null){
                num2Map.put(item,1);
            }else{
                num2Map.put(item,num2Map.get(item)+1);
            }
        }

        List<Integer> results = new ArrayList<>();
        for (int key:
             num1Map.keySet()) {
            // 有同样的元素
            if(num2Map.get(key) !=null){
                //判断出现的次数
                int cnt = num1Map.get(key)<num2Map.get(key)?num1Map.get(key):num2Map.get(key);
                for (int i = 0; i < cnt; i++) {
                    results.add(key);
                }
            }
        }

        // 首先对List<Integer>调用stream方法，转成Stream<Integer>。
        // 然后对Stream<Integer>调用mapToInt(Integer::valueOf)方法，转成IntStream
        // 最后对IntStream调用toArray()转成int[]。
        return  results
                .stream()
                .mapToInt(Integer::valueOf)
                .toArray();
    }
}

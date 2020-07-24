package CheckPermutationLCCI;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean CheckPermutation(String s1, String s2) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for (char a:
             s1.toCharArray()) {
            if(map1.get(a)==null){
                map1.put(a,1);
            }else{
                map1.put(a,map1.get(a)+1);
            }
        }
        for (char b:
                s2.toCharArray()) {
            if(map2.get(b)==null){
                map2.put(b,1);
            }else{
                map2.put(b,map2.get(b)+1);
            }
        }

        if(map1.size() != map2.size()){
            return false;
        }

        for (char key:
             map1.keySet()) {
            if(map2.get(key) == null){
                return false;
            }
            else if(map1.get(key) != map2.get(key)){
                return false;
            }
        }
        return true;
    }
}

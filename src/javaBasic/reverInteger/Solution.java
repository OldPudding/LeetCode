package javaBasic.reverInteger;

import org.junit.Test;

public class Solution {

    @Test
    public void test(){
        int i = 120;
        System.out.println("before:"+i);
        System.out.println("after :"+reverse(i));
    }

    public int reverse(int x) {
        if(x==0){
            return 0;
        }

        String numStr = String.valueOf(x);
        String rNumStr = "";
        if(x > 0){
            for (int i = numStr.length()-1; i >= 0; i--) {
                rNumStr+=numStr.charAt(i);
            }
        }else {
            rNumStr+="-";
            for (int i = numStr.length()-1; i >= 1; i--) {
                rNumStr+=numStr.charAt(i);
            }
        }

        try{
            return Integer.valueOf(rNumStr);
        }catch (Exception e){
            e.printStackTrace();
            return  0;
        }
    }
}
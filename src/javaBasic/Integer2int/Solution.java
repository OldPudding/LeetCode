package javaBasic.Integer2int;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        int[] intArray1 = {1, 2, 3, 4, 5};

        // int[] 转 List<Integer>
        List<Integer> listInteger1 =IntStream.of(intArray1)   //先把int[]转成IntStream
                                    .boxed()                  //再把IntStream转成Stream<Integer>
                                    .collect(Collectors.toList());  //再把Stream<Integer>转成List<Integer>

        // int[] 转 Integer[]
        Integer[] IntegerArray1 = IntStream.of(intArray1)     //先把int[]转成IntStream
                                    .boxed()                  //再把IntStream转成Stream<Integer>
                                    .toArray(Integer[]::new); //用toArray方法，传入IntFunction<A[]> generator

        // List<Integer> 转 int[]
        int[] intArray2 = listInteger1.stream()               //先把List<Integer>转成Stream<Integer>
                            .mapToInt(Integer::valueOf)       //把Stream<Integer>转成IntStream
                            .toArray();                       //把IntStream转成int[]


        // Integer[] 转 int[]
        int[] intArray3 = Arrays.stream(IntegerArray1)        //把Integer[]转成Stream<Integer>
                            .mapToInt(Integer::valueOf)       //把Stream<Integer>转成IntStream
                            .toArray();                       //把IntStream转成int[]

        // List<Integer> 转 Integer[]
        Integer[] IntegerArray2 = listInteger1.toArray(new Integer[0]);

        // Integer[] 转 List<Integer>
        List<Integer> listInteger2 = Arrays.asList(IntegerArray2);
    }
}

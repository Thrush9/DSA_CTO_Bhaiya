package org.training.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class CheckSingleNumber {

    public static void main(String[] args) {
        findSingleNumber();
        findSingleNumberUsingXOR();
    }

    private static void findSingleNumber() {
        int[] nums = {4,1,2,1,2};

        Map<Integer,Integer> numMap = new HashMap<>();
        Map<Integer,Integer> numberMap = new HashMap<>();
        for (int num : nums){
            if(numMap.containsKey(num))
                numMap.put(num, numMap.get(num)+1);
            else
                numMap.put(num,1);

            //numberMap.put(num, numberMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(numMap);
        System.out.println(numberMap);

        for(Map.Entry<Integer,Integer> entry : numMap.entrySet())
            if(entry.getValue() == 1)
                System.out.println(entry.getKey());
    }

    private  static void findSingleNumberUsingXOR() {
        int[] nums = {4,1,2,1,2};
        int res = 0;
        for (int num: nums){
            res = res ^ num;
            System.out.println(res);
        }
        System.out.println(res);
    }
}

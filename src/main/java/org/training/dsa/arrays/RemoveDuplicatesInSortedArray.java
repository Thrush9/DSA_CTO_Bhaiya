package org.training.dsa.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInSortedArray {

    public static void main(String[] args) {
        removeUsingBruteForce();
        removeDuplicatesFromArray();
    }

    public static void removeUsingBruteForce() {
        int[] nums = {0,1,2,3,3,4};
        Set<Integer> numsSet = new HashSet<>();
        for (int num: nums)
            numsSet.add(num);
        System.out.println(numsSet);

    }

    private static void removeDuplicatesFromArray() {
        int[] nums = {0,1,2,3,3,4};
        //int[] nums = {1,1,2};
        int i=1;
        for (int j = 1; j < nums.length; j++) {
            if(nums[j-1] != nums[j]){
                nums[i] = nums[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("Total Unique :: "  + i);
    }
}

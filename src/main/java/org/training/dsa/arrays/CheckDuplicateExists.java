package org.training.dsa.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckDuplicateExists {
    public static void main(String[] args) {
        checkDuplicatesUsingBruteForce();
        checkDuplicatesExists();
    }

    private static void checkDuplicatesUsingBruteForce() {
        int[] nums ={1,2,3,7};
        boolean  isDuplicate = false;
        Set<Integer> numSet = new HashSet<>();

        for (int num: nums){
            if(numSet.contains(num))
                isDuplicate = true;
            else
                numSet.add(num);
        }
        System.out.println(isDuplicate);
    }

    private static void checkDuplicatesExists() {
        int[] nums = {1,2,3,1};
        boolean  isDuplicate = false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                isDuplicate = true;
                break;
            }
        }
        System.out.println(isDuplicate);
    }
}

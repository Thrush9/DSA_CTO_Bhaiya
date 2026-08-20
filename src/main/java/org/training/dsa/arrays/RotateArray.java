package org.training.dsa.arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        LeftRotateArray();
        System.out.println();
        LeftRotateArrayUsingReverseAlgo();
        System.out.println();
        RightRotateArray();
        System.out.println();
        RightRotateArrayUsingReverseAlgo();
    }

    private static void LeftRotateArray() {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        int k = 3;
        int len = nums.length;
        for (int i =0; i<k ; i++){
            int first = nums[0];
            for (int j = 0; j <len-1  ; j++) {
                nums[j] = nums[j+1];
            }
            nums[len-1] = first;
            System.out.println(Arrays.toString(nums));
        }
    }

    private static void RightRotateArray() {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        int k = 3;
        int len = nums.length;
        for (int i =0; i<k ; i++){
           int last = nums[len - 1];
            for (int j = len-1; j > 0 ; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = last;
            System.out.println(Arrays.toString(nums));
        }
    }


    private static void reverseArray(int[] nums, int l , int r){
        while (l<=r){
         int temp = nums[l];
         nums[l] = nums[r];
         nums[r] = temp;
         l++;
         r--;
        }
    }

    private static void RightRotateArrayUsingReverseAlgo(){
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        int k = 3;
        int len = nums.length;

        reverseArray(nums, 0 , len-1);
        System.out.println(Arrays.toString(nums));
        reverseArray(nums, 0, k-1);
        System.out.println(Arrays.toString(nums));
        reverseArray(nums, k, len-1);
        System.out.println(Arrays.toString(nums));
    }

    private static void LeftRotateArrayUsingReverseAlgo(){
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        int k = 3;
        int len = nums.length;
        reverseArray(nums, 0, k-1);
        System.out.println(Arrays.toString(nums));
        reverseArray(nums, k, len-1);
        System.out.println(Arrays.toString(nums));
        reverseArray(nums, 0 , len-1);
        System.out.println(Arrays.toString(nums));
    }
}

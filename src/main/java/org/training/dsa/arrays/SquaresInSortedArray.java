package org.training.dsa.arrays;

import java.util.Arrays;

public class SquaresInSortedArray {
    public static void main(String[] args) {
        squareByBruteForce();
        squareByTwoPointerApproach();
    }

    private static void squareByBruteForce() {
        int[] arr = {-6,-4,-1,0,3,9};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void squareByTwoPointerApproach(){
        int[] arr = {-6,-4,-1,0,3,9};
        int i=0, j= arr.length-1;

        int result[] = new int[arr.length];
        for (int k = arr.length-1; k >=0 ; k--) {
            System.out.println(Math.abs(arr[i]));
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                result[k] = arr[i] * arr[i];
                i++;
            } else {
                result[k] = arr[j] * arr[j];
                j--;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            arr[k] = result[k];
        }
        System.out.println(Arrays.toString(arr));
    }
}

package org.training.dsa.arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        moveZerosToEnd();
        System.out.println();
        moveZerosToEndInPlace();
    }

    private static void moveZerosToEnd() {
        int[] arr ={ 1,0,3,0,5,6,9};
        System.out.println(Arrays.toString(arr));
        int[] newArr = new int[arr.length];
        int i=0;
        for (int num:arr){
            if(num !=0 ) {
                newArr[i] = num;
                i++;
            }
        }
        while(i<arr.length) {
            newArr[i] = 0;
            i++;
        }
        System.out.println(Arrays.toString(newArr));
    }

    private static void moveZerosToEndInPlace(){
        int[] arr ={ 1,0,3,0,5,6,9};
        System.out.println(Arrays.toString(arr));
        int i=0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}

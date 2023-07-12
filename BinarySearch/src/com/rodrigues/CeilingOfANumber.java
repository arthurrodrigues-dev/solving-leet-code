package com.rodrigues;

public class CeilingOfANumber {
    public static void main(String[] args) {
       int[] arr = {2, 3, 5, 9, 14, 16, 17};
       int target = 18;
       int ans = ceiling(arr, target);
       System.out.println(ans);
    }

    static int ceiling(int[] arr, int target) {

        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}

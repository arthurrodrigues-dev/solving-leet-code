package com.rodrigues;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 1;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] > target) {
                end = mid -1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}

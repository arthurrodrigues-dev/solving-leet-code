package com.rodrigues;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}

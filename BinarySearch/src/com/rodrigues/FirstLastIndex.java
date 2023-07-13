package com.rodrigues;

import java.util.Arrays;

public class FirstLastIndex {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 10};
        int target = 7;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[] arr, int target) {
        int[] res = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                res[0] = i;
                break;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                res[1] = i;
                break;
            }
        }

        return res;
    }
}

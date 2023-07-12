package com.rodrigues;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        char ans = smallestLetter(letters, target);
        System.out.println(ans);
    }

    // return index
    static char smallestLetter(char[] letters, char target) {
//        if (target > letters[letters.length -1]) return letters[0];

        int start = 0;
        int end = letters.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;

            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}

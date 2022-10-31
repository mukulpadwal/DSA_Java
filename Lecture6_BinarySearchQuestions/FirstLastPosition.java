package Lecture6_BinarySearchQuestions;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class FirstLastPosition {
    public static void main(String[] args) {

    }

    static int[] searchRangeLinear(int[] nums, int target) {
        int[] ans = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans[0] = i;
                break;
            }
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] == target) {
                ans[1] = j;
                break;
            }
        }

        return ans;
    }

    static int[] searchRangeBinary(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);

        return ans;
    }

    static int search(int[] nums, int target, boolean isLeft) {
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (isLeft) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }


}

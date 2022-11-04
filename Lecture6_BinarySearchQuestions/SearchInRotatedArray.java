package Lecture6_BinarySearchQuestions;

// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class SearchInRotatedArray {
    public static void main(String[] args) {

        System.out.println(search(new int[]{4,5,6,7,0,1,2},4));
        System.out.println(search(new int[]{4,5,6,7,0,1,2},3));
        System.out.println(search(new int[]{1},0));
        System.out.println(search(new int[]{1,5,3},3));
        System.out.println(search(new int[]{5,1,3},1));

    }

    // won't work for duplicate values in array

    static int search(int[] nums, int target) {
        int peakIndex = findPivotIndex(nums);

        if(peakIndex == -1){
            // This means the array is not rotated
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        if(target == nums[peakIndex]){
            return peakIndex;
        }

        int ans = -1;

        if(target >= nums[0]){
            ans =  binarySearch(nums, target, 0, peakIndex - 1);
            if(ans != -1) return ans;
        }

        return binarySearch(nums, target, peakIndex+1, nums.length - 1);

    }

    static int findPivotIndex(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }

            if(mid > start && nums[mid] < nums[mid-1]){
                return mid - 1;
            }

            if(nums[start] >= nums[mid]){
                end = mid - 1;
            }

            if(nums[start] < nums[mid]){
                start = mid;
            }
        }

        return -1;
    }

    static int binarySearch(int[] nums, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                return mid;
            } else if(target > nums[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

}

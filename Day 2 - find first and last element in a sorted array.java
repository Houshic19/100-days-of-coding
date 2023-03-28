class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = binSearch(nums, target - 1);
        int second = binSearch(nums, target);

        if (first == second) {
            return new int[]{-1, -1};
        }

        return new int[]{first + 1, second};
    }

    private static int binSearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int curr = nums[mid];
            if (curr <= target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }
}
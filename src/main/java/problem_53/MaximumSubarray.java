package problem_53;


public class MaximumSubarray {
    public static void main(String[] args) {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int x = maximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(x);
    }

    public int maxSubArray(int[] nums) {
        int sum = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            sum = sum + nums[i];

        }
        int i = 0, l = len - 1;
        while (len > 0) {
            len--;
            if (nums[i] <= nums[l]) {
                if (sum < sum - Math.abs(nums[i++])) {
                    sum = sum - Math.abs(nums[i++]);
                }
            } else {

                if (sum < sum - Math.abs(nums[l])) {
                    sum = sum - Math.abs(nums[l--]);

                }
            }
        }

        return sum;

    }
}

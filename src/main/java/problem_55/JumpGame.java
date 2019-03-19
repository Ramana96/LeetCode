package problem_55;

public class JumpGame {
    public static void main(String[] args) {
        JumpGame j = new JumpGame();
        System.out.println(j.canJump(new int[]{2, 0}));

    }

    public boolean canJump(int[] nums) {
        int i = 0, len = nums.length;
        if (i == len - 1) {
            return true;
        } else {
            while (i < len) {
                if (i == len - 1) {
                    return true;
                }
                if (nums[i] != 0) {
                    i = i + nums[i];
                } else {
                    break;
                }
            }
            if (i == len - 1) {
                return true;
            }
            return false;

        }
    }
}

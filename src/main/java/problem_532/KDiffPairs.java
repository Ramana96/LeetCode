package problem_532;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class KDiffPairs {
    public static void main(String[] args) {
        KDiffPairs kDiffPairs = new KDiffPairs();
        int x = kDiffPairs.findPairs(new int[]{1, 1, 1, 2, 1}, 1);
        System.out.println(x);

    }

    public int findPairs(int[] nums, int k) {
        int count = 0, len = nums.length, x = 0;
        Map<Integer, Integer> map = new HashMap<>();

        if (k >= 0) {

//            arrayList.add(nums[0]);
            for (int i = 0; i < len; i++) {
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                for (int j = i + 1; j < len; j++) {
                    if (!arrayList.contains(nums[j])) {
                        x = nums[i] - nums[j];
                        if (x == k || x == -1 * k) {
                            count++;
                            arrayList.add(nums[j]);
                        }
                    }

                }
            }
        }
        return count;
    }
}

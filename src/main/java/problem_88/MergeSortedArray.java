package problem_88;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = new int[]{4,5,6,0,0,0};
        int[] nums2 = new int[]{1,2,3};
        int m = 1, n = 1;
        mergeSortedArray.merge(nums1, m, nums2, n);
        for (int i : nums1) {
            System.out.println(i);
        }
    }


    private void insert(int i, int insertval, int[] nu) {
//        int temp = insertval;
        for (int k = nu.length - 1; k >= i ; ) {
            nu[k] = nu[--k];
        }
//        nu[i + 1] = nu[i];
        nu[--i] = insertval;

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

      if (n==0){
          return;
      }
          int j = 0, i = 0;
        int k = m;
        for (; i < k && j<n; i++) {
            if (nums1[i] <= nums2[j]) {
                i++;
            } else {
                if (i==0) {
                i++;
                }
                insert(i, nums2[j], nums1);
                i++;
                k++;
                j++;

            }
        }
        if (j < n) {
            System.arraycopy(nums2, j, nums1, k, n - j);
        }
    }
}

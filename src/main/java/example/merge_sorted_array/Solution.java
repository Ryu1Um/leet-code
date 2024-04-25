package example.merge_sorted_array;


public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        var index_nums1 = 0;
        var index_nums2 = 0;
        var resultNums = new int[m + n];
        if (n == 0) return;
        else if (m == 0) {
            for (int i = 0; i < n + m; i++) {
                nums1[i] = nums2[i];
            }
            return;
        } else {
            for (int i = 0; i < m + n; i++) {
                if (index_nums2 > n && index_nums1 != m) {
                    resultNums[i] = nums1[index_nums1];
                    index_nums1++;
                } else if (index_nums2 < n && index_nums1 == m) {
                    resultNums[i] = nums2[index_nums2];
                    index_nums2++;
                }
                else if ((nums1[index_nums1] > nums2[index_nums2])) {
                    resultNums[i] = nums2[index_nums2];
                    index_nums2++;
                } else  {
                    resultNums[i] = nums1[index_nums1];
                    index_nums1++;
                }
            }
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = resultNums[i];
        }
    }
}
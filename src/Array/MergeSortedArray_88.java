package Array;

import java.util.Arrays;

public class MergeSortedArray_88 {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n){
        while (m > 0 && n > 0){
            if (nums2[n-1] > nums1[m-1]) {
                nums1[m + n - 1] = nums2[n - 1];
                n--;
            }
            else {
                nums1[m + n - 1] = nums1[m - 1];
                m--;
            }
        }
        while (n > 0){
            nums1[m+n-1] = nums2[n-1];
            n--;
        }
        return nums1;
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
    }
}

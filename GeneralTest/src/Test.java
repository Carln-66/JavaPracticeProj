import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: Carl
 * @Date: 2021/02/15/0:11
 * @Description: 输入：[1,12,-5,-6,50,3], k = 4
 *                      输出：12.75
 */
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{1,12,-5,-6,50,3};
        double average = solution.findMaxAverage(arr, 4);
        System.out.println(average);

    }
}
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0, n = nums.length;
        for (int i = 0; i < k; i++){
            sum += nums[i];
        }
        int maxSum = sum;
        for(int i = k; i < n; i++){
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return 1.0 * maxSum / k;
    }
}


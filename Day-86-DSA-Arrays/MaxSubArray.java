public class MaxSubArray {
    
    public static int maxSubArray(int[] nums) {
        int maxSum = 0;
        int currentSum = 0;
        
        for (int num : nums) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
    
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        System.out.println("Maximum subarray sum: " + maxSubArray(nums));
    }
}

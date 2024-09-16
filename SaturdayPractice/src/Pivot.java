public class Pivot {

    public static int findPivotIndex(int[] nums) {
        int Sum = 0;
        int leftSum = 0;
        for (int num : nums) {
            Sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
        	int rightSum = Sum - leftSum - nums[i];
        	if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,-1};
        int pivotIndex = findPivotIndex(nums);
        System.out.println("The pivot index is: " + pivotIndex);
    }
}

public class RotateArrayFromNIndex1 {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArrayFromNIndex rafi = new RotateArrayFromNIndex();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rafi.rotate(nums, 3);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
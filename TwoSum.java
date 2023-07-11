public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two numbers add up to the target sum.");
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] n1 = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(n1, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");

    }
}

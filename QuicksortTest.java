public class QuicksortTest {
    public static void main(String[] args) {
        int[] nums = new int[]{ 5, 4, 3, 2, 1 };

        Quicksort.quicksort(nums, 0, nums.length-1);

        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
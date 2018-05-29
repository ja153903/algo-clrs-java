public class Quicksort {

    public static void quicksort(int[] nums, int start, int end) {
        if (start < end) {
            int p = partition(nums, start, end);
            quicksort(nums, start, p-1);
            quicksort(nums, p+1, end);
        }
    }

    public static int partition(int[] nums, int start, int end) {
        int temp;
        int pivot = nums[end];
        int i = start-1;
        for (int j = start; j <= end-1; j++) {
            //System.out.println(nums[j] + " <= " + pivot);
            if (nums[j] <= pivot) {
                i++;

                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        temp = nums[i+1];
        nums[i+1] = nums[end];
        nums[end] = temp;

        return i + 1;
    }
}
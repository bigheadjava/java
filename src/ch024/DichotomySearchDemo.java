package ch024;

/**
 * 演示二分法查找，适合已经排序的数组
 * @author 程序猿大头
 *
 */
public class DichotomySearchDemo {

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int idx = search(nums, 5);
		System.out.println("5是数组中第" + idx + "个元素");
	}

	/**
	 * 在数组中查找元素，采用二分法查找，适合已经排序的数组
	 * 
	 * @param nums
	 * @param value
	 * @return
	 */
	public static int search(int[] nums, int value) {
		int low = 0;
		int high = nums.length - 1;
		int middle;
		while (low <= high) {
			middle = (low + high) / 2;
			if (value == nums[middle]) {
				return middle;
			}
			if (value < nums[middle]) {
				high = middle - 1;
			} else {
				low = middle + 1;
			}
		}
		return -1;
	}

}

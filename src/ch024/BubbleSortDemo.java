package ch024;

/**
 * 演示冒泡排序
 * 
 * @author 程序猿大头
 *
 */
public class BubbleSortDemo {

	public static void main(String[] args) {
		int[] nums = new int[] { 7, 4, 8, 3, 9, 2 };
		sort(nums);
		for (int i : nums) {
			System.out.println(i);
		}

	}

	public static void sort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {// 遍历次数
			for (int j = 0; j < nums.length - 1 - i; j++) {// 每次遍历中的比较
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
				System.out.println("第" + (i + 1) + "次遍历中，第" + (j + 1) + "次比较;");
				if (j == nums.length - 1 - i - 1) {
					System.out.println("---------------------");
				}
			}
		}
	}

}

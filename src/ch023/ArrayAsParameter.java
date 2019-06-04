package ch023;

/**
 * 演示数组作为参数
 * @author 程序猿大头
 *
 */
public class ArrayAsParameter {

	public static void main(String[] args) {
		int[] nums = new int[10];// 定义一个长度为10的数组
		/**
		 * 用随机数给数组nums赋值
		 *
		 */
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 10);
		}

		printArray(nums);// 调用该方法打印数组
	}

	// 打印数组
	public static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}

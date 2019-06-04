package ch023;

/**
 * 演示数组作为方法返回值
 * @author 程序猿大头
 *
 */
public class ArrayAsReturnValue {

	public static void main(String[] args) {
		int[] redBalls = generateLNums(33);
		printArray(redBalls);
	}

	public static int[] generateLNums(int max) {
		int[] nums = new int[6];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * max) + 1;
		}
		return nums;
	}

	public static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}

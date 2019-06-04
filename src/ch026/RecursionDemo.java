package ch026;

/**
 * 演示递归调用
 * @author 程序猿大头
 *
 */
public class RecursionDemo {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	/**
	 * 求一个整数的阶乘
	 * @param num
	 * @return
	 */
	public static long factorial(long num) {
		if (num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}

}

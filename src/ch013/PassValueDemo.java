package ch013;

/**
 * 用于演示“值传递” 
 * 
 * @author 程序猿大头
 *
 */
public class PassValueDemo {

	public static void main(String[] args) {
		/**
		 * 定义两个int类型变量a，b并分别赋值
		 */
		int a = 1, b = 2;
		System.out.println("调用swape方法前：a = " + a + "; b = " + b);
		swape(a, b);
		System.out.println("调用swape方法后：a = " + a + "; b = " + b);
	}

	/**
	 * 该方法用来交换参数a和b的值
	 * 
	 * @param a
	 * @param b
	 */
	public static void swape(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}

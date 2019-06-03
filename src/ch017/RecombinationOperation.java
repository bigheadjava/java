package ch017;

/**
 * 演示复合操作符用法
 * 
 * @author 程序猿大头
 *
 */
public class RecombinationOperation {

	public static void main(String[] args) {
		int a = 8, b = 2;

		System.out.println(a + b);
		System.out.println(a += b);
		System.out.println(a);

		a = 8;
		b = 2;
		System.out.println(a - b);
		System.out.println(a -= b);
		System.out.println(a);

		a = 8;
		b = 2;
		System.out.println(a * b);
		System.out.println(a *= b);
		System.out.println(a);

		a = 8;
		b = 2;
		System.out.println(a / b);
		System.out.println(a /= b);
		System.out.println(a);

		a = 8;
		b = 2;
		System.out.println(a % b);
		System.out.println(a %= b);
		System.out.println(a);
	}

}

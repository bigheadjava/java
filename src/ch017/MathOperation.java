package ch017;

/**
 * 演示数学运算操作符
 * 
 * @author 程序猿大头
 *
 */
public class MathOperation {

	public static void main(String[] args) {
		int a1 = 1 + 1; // a1取值2
		int a2 = 1 - 1; // a2取值0
		int a3 = 1 * 2; // a3取值2
		int a4 = 4 / 2; // a4取值2

		int a5 = 10 / 3; // a5取值3
		int a6 = 10 % 3; // a6取值1

		int a7 = 10 / 0; // 运行程序时会抛出AirthmeticException
		int a8 = 10 % 0; // 运行程序时会抛出AirthmeticException
	}

}

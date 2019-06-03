package ch014;

/**
 * 用于演示变量的作用域
 * 
 * @author 程序猿大头
 *
 */
public class VarArea {
	/**
	 * 声明一个int类型变量var_1，它属于成员变量
	 */
	private int var_1;

	/**
	 * 
	 * @param var_2, int类型，var_2是方法参数
	 */
	public void method_1(int var_2) {
		int var_3 = 1; // 局部变量，方法内部声明的
		if (var_3 > 0) {
			int var_4 = 2; // 局部变量，在if代码块内声明的
			System.out.println("----------我在method_1方法的if代码块内----------");
			System.out.println("var_1 = " + var_1);
			System.out.println("var_2 = " + var_2);
			System.out.println("var_3 = " + var_3);
			System.out.println("var_4 = " + var_4);
		}
		System.out.println("----------我在method_1方法的if代码块外----------");
		System.out.println("var_1 = " + var_1);
		System.out.println("var_2 = " + var_2);
		System.out.println("var_3 = " + var_3);
		/**
		 * 编译出错，因为var_4声明在if代码块内，作用范围只是if代码块内，此处无法访问
		 */
		// System.out.println("var_4 = " + var_4);
	}

	public void method_2() {
		System.out.println("----------我在method_2方法内----------");

		System.out.println("var_1 = " + var_1);
		/**
		 * 编译出错，因为var_2声明在method_1方法的参数里，作用范围只是在method_1方法里内，此处无法访问
		 */
		// System.out.println("var_2 = " + var_2);
		/**
		 * 编译出错，因为var_3声明在method_1方法内，作用范围只是在method_1方法里内，此处无法访问
		 */
		// System.out.println("var_3 = " + var_3);
		/**
		 * 编译出错，因为var_4声明在method_1方法里的if代码块内，作用范围只是在method_1方法里的if代码块内，此处无法访问
		 */
		// System.out.println("var_4 = " + var_4);
	}
}

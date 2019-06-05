package ch037;

/**
 * 演示实例方法可以访问的内容
 * 
 * @author 程序猿大头
 *
 */
public class InstanceMethodAccessDemo {
	private String var_1;

	private static final double PI = 3.14;

	private static int var_2 = 0;

	public void method_1() {

	}

	public void method_3() {
		var_1 = "Java"; // 实例方法可以访问所在类的实例变量
		System.out.println(PI); // 实例方法可以访问所在类的静态常量
		var_2 = 1; // 实例方法可以访问所在类的静态变量；
		method_1(); // 实例方法可以访问所在类的实例方法
		method_2(); // 实例方法可以访问所在类的静态方法
	}

	public static void method_2() {

	}
}

package ch037;

/**
 * 演示静态方法可以访问的内容
 * 
 * @author 程序猿大头
 *
 */
public class StaticMethodAccessDemo {

	private String var_1;

	private static final double PI = 3.14;

	private static int var_2 = 0;

	public void method_1() {

	}

	public static void method_2() {

	}

	public static void main(String[] args) {
		// var_1 = "Java"; 编译出错，静态方法中不能访问实例变量
		System.out.println(PI); // 静态方法中可以访问静态常量
		var_2++; // 静态方法中可以访问静态常量
		// method_1(); 编译出错，静态方法中不能访问实例方法
		method_2(); // 静态方法中可以访问其他的静态方法
	}
}

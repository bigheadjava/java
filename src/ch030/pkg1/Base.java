package ch030.pkg1;

/**
 * 演示子类隐藏父类的静态方法
 * @author 程序猿大头
 *
 */
public class Base {
	void method() {
		System.out.println("父类的实例方法...");
	}
	
	static void staticMethod() {
		System.out.println("父类的静态方法...");
	}
}

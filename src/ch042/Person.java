package ch042;

/**
 * 演示反射
 * @author 程序猿大头
 *
 */
public class Person {

	private String name = "刘德华";
	public int age = 56;

	public Person() {
		 System.out.println("调用Person构造方法...");
	}

	private void sayHello() {
		System.out.println("调用私有方法sayHello()...");
	}

	public void sing() {
		System.out.println("调用公开方法sing()...");
	}
	
	static {
		System.out.println("加载静态代码块...");
	}
}

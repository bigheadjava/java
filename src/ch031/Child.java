package ch031;

/**
 * 演示super用法
 * @author 程序猿大头
 *
 */
public class Child extends Base {
	public String var = "Child var"; // 隐藏了父类中的变量var

	public void method() {
		System.out.println("Used method in Child class...");
	}

	public Child() {
		super(5); // 调用Base里的有参数构造方法
		count *= 2;
	}

	public void test() {
		String var = "var in Child's method..."; // 局部变量

		System.out.println("var in Child's method: " + var); // 输出Child类中method方法里的var
		System.out.println("this.var: " + this.var); // 输出Child类里成员变量var
		System.out.println("super.var: " + super.var); // 输出Base类里的成员变量var

		method(); // 调用Child类的method
		this.method(); // 调用Child类的method
		super.method(); // 调用父类Base里的method

		System.out.println("count = " + count);
	}
}

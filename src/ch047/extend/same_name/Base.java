package ch047.extend.same_name;

/**
 * 演示子类和父类中的内部类同名
 * 
 * @author 程序猿大头
 *
 */
public class Base {
	InnerClass ic;

	public Base() {
		ic = new InnerClass();
	}

	public class InnerClass {
		public InnerClass() {
			System.out.println("Base中的内部类InnerClass...");
		}
	}
}

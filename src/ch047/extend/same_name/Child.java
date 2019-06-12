package ch047.extend.same_name;

/**
 * 演示子类和父类中的内部类同名
 * 
 * @author 程序猿大头
 *
 */
public class Child extends Base {
	public class InnerClass {
		public InnerClass() {
			System.out.println("Child中的内部类InnerClass...");
		}
	}

	public static void main(String[] args) {
		Child.InnerClass ci = new Child().new InnerClass();
		Base.InnerClass bi = new Base().new InnerClass();
	}
}

package ch047.extend;

/**
 * 演示内部类的继承
 * 
 * @author 程序猿大头
 *
 */
public class OuterClass {
	private int o1;

	public OuterClass() {

	}

	public OuterClass(int o1) {
		this.o1 = o1;
	}

	class InnerClass {
		public InnerClass() {

		}

		public void method() {
			System.out.println("o1 = " + o1);
		}
	}
}

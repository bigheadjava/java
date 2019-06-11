package ch047.second;

/**
 * 演示内部类可以访问外部类的所有成员
 * 
 * @author 程序猿大头
 *
 */
public class OuterClass {

	private int a1;
	public int a2;
	static int a3;

	public OuterClass() {

	}

	public OuterClass(int a1, int a2) {
		super();
		this.a1 = a1;
		this.a2 = a2;
	}

	protected int method() {
		return a1 * a1 + a2 * a2;
	}

	class InnerClass { // 内部类
		int b1 = a1; // 直接访问private属性a1
		int b2 = a2; // 直接访问public属性a2
		int b3 = a3; // 直接访问static属性a3
		int b4 = new OuterClass(2, 4).a1; // 访问一个新创建的OuterClass对象的a1属性
		int b5 = method(); // 访问method()方法
	}

	public static void main(String[] args) {
		OuterClass.InnerClass ic = new OuterClass(5,2).new InnerClass();
		System.out.println("ic.b1 = " + ic.b1);
		System.out.println("ic.b2 = " + ic.b2);
		System.out.println("ic.b3 = " + ic.b3);
		System.out.println("ic.b4 = " + ic.b4);
		System.out.println("ic.b5 = " + ic.b5);
	}

}

package ch047.third;

/**
 * 演示外部类访问内部类的成员
 * 
 * @author 程序猿大头
 *
 */
public class ClassA {

	class ClassB { // ClassA的内部类
		private int b1 = 1;
		public int b2 = 2;

		class ClassC { // ClassB的内部类

		}
	}

	public void test() {
		// int a1 = b1; 编译出错，不能直接访问内部类B的成员变量b1
		// int a2 = b2; 编译出错，不能直接访问内部类B的成员变量b1

		// ClassB.ClassC c1 = new ClassC(); 编译出错，不能直接访问内部类ClassB的内部类ClassC

		ClassB b = new ClassB(); // 合法
		int a3 = b.b1; // 合法，可以通过内部类ClassB的实例去访问变量b1
		int a4 = b.b2; // 合法，可以通过内部类ClassB的实例去访问变量b2

		ClassB.ClassC c2 = b.new ClassC(); // 合法，可以通过内部类ClassB的实例去访问ClassB的内部类ClassC
		ClassB.ClassC c3 = new ClassB().new ClassC(); // 合法，可以通过内部类ClassB的实例去访问ClassB的内部类ClassC

	}
}

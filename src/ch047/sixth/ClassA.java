package ch047.sixth;

/**
 * 演示局部内部类
 * 
 * @author 程序猿大头
 *
 */
public class ClassA {

	public void method() {
		class ClassB {
			int b1;
			int b2;
			// static int b3; 编译出错，局部内部类不能包含静态成员

			class ClassC {
				int c;
			}
		}
		ClassB cb = new ClassB(); // 合法，在方法里面访问
		ClassB.ClassC cc = cb.new ClassC(); // 合法，在方法里面访问
	}

	// ClassB cb1 = new ClassB(); 不合法，不能在方法里面访问
}

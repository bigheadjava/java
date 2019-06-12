package ch047.inter.pkg;

/**
 * 演示接口中定义内部类
 * @author 程序猿大头
 *
 */
public class ClassA implements MyInterface {

	@Override
	public void print() {
		InnerClass ic = new InnerClass();
		System.out.println("ClassA实现了MyInterface...");
	}
	
}

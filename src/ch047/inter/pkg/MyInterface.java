package ch047.inter.pkg;

/**
 * 演示接口中定义内部类
 * @author 程序猿大头
 *
 */
public interface MyInterface {
	
	public class InnerClass{
		public void method() {
			System.out.println("接口中的内部类中的方法...");
		}
	}
	
	public void print();
}

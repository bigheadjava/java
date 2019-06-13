package ch047.use.v2;

/**
 * 
 * @author 程序猿大头
 * 
 * 演示内部类可以直接访问外部类的成员
 */
public class ClassA {

	private int count;

	class ClassB {
		public void reset() {
			count = 0;
		}
	}
}

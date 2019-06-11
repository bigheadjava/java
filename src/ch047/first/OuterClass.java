package ch047.first;

/**
 * 演示内部类
 * @author 程序猿大头
 *
 */
public class OuterClass {
	/**
	 * 内部类
	 */
	public class InnerClass{
		public int add(int i, int j) {
			return i + j;
		}
	}
	
	private InnerClass ic = new InnerClass();
	
	public void add(int i, int j) {
		ic.add(i, j);
	}
}

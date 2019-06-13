package ch047.use;

/**
 * 演示内部类的用途 - 封装类型
 * 
 * @author 程序猿大头
 *
 */
public class Sample1 {

	private class InnerClass implements MyInterface {
		@Override
		public int add(int a, int b) {
			return a + b;
		}
	}

	public InnerClass getInnerClass() {
		return new InnerClass();
	}
}

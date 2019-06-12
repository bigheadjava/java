package ch047.inter;

/**
 * 演示内部接口
 * @author 程序猿大头
 *
 */
public class Sample1 {
	
	public interface MyInterface{ //内部接口
		public int add(int i, int j);
	}
	
	private MyInterface mi = new MyInterface() { //匿名内部类实现了接口MyInterface
		@Override
		public int add(int i, int j) {
			return i + j;
		}
	};
	
	public class InnerClass implements MyInterface{

		@Override
		public int add(int i, int j) {
			System.out.println("...成员内部类实现了MyInterface接口...");
			return i + j;
		}
		
	}
}

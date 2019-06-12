package ch047.anonymous;

/**
 * 演示匿名内部类
 * 
 * @author 程序猿大头
 *
 */
public class Sample {
	private int a;
	
	public Sample() {
		System.out.println("调用Sample类无参数构造方法...");
	}

	public Sample(int a) {
		this.a = a;
		System.out.println("调用Sample类有参数构造方法...");
	}
	
	public void method() {
		System.out.println("调用Sample类的method方法...");
	}

	public static void main(String[] args) {
		new Sample().method();
		Sample s = new Sample() {
			public void method() {
				{System.out.println("初始化匿名内部类...");}
				System.out.println("调用匿名内部类的method方法...");
			}
		};
		s.method();
	}

}

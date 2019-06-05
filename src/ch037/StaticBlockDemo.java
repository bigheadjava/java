package ch037;

/**
 * 演示静态代码块
 * 
 * @author 程序猿大头
 *
 */
public class StaticBlockDemo {

	static {
		System.out.println("执行第一个静态代码块...");
	}

	public static void main(String[] args) {
		System.out.println("执行main方法...");
	}

	static {
		System.out.println("执行第二个静态代码块...");
	}

}

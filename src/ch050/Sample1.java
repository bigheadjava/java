package ch050;

/**
 * 演示多个线程共享同一个对象的实例变量
 * 
 * @author 程序猿大头
 *
 */
public class Sample1 extends Thread {

	private int a = 1;

	@Override
	public void run() {
		while (a <= 50) {
			System.out.println(currentThread().getName() + " : a = " + a);
			a++;
		}
	}

	public static void main(String[] args) {
		Sample1 s = new Sample1();
		s.start(); // Sample1线程
		s.run(); // 主线程
	}

}
